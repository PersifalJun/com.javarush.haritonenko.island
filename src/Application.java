import config.Settings;
import entity.Island;
import entity.Location;


import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        Island island = new Island(Settings.columnsCount, Settings.rowsCount); // остров
        island.createLocations(); //Создаие локаций
        Location[][] location1 = island.getLocations(); // Инициализация массива локаций



        // Пул потоков
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(4); // 4 ядра

        // Латч для ожидания завершения всех потоков
        CountDownLatch latch = new CountDownLatch(Settings.columnsCount * Settings.rowsCount);

        // Для корректного увеличения цисла циклов
        AtomicInteger completedCycles = new AtomicInteger(0);

        // Запуск обработки локаций по порядку (по одной каждую 3 секунды)
        for (int i = 0; i < Settings.columnsCount; i++) {
            for (int j = 0; j < Settings.rowsCount; j++) {
                final int column = i;
                final int row = j;

                // Локация для текущего потока
                final Location location = location1[i][j];


                // Задача для каждой локации
                Runnable locationTask = () -> {
                    try {
                        int totalCycles = location.lifeCycles;
                        AtomicInteger localCompletedCycles = new AtomicInteger(0);

                        // Выполнение жизненного цикла для локации
                        for (int cycle = 0; cycle < totalCycles; cycle++) {
                            if (!location.getAnimals().isEmpty()) {
                                location.run(); // Запуск жизненного цикла
                                localCompletedCycles.incrementAndGet();
                            } else {
                                System.out.println("Локация [" + column + ", " + row + "] пуста.");
                                break; // Прерывание, если в локации нет животных
                            }
                        }

                        // Вывод результата для текущей локации
                        System.out.println("Локация [" + column + ", " + row + "] завершила " + localCompletedCycles.get() + " циклов.");
                        completedCycles.addAndGet(localCompletedCycles.get());

                        // Уменьшаем латч, чтобы обозначить завершение задачи для этой локации
                        latch.countDown();

                        // Задержка 3 секунды перед выводом следующей локации
                        Thread.sleep(3000); // Задержка 3 секунды (3000 миллисекунд)
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // В случае прерывания потока
                    }
                };

                // Запускаем задачу для текущей локации в последовательном потоке
                ses.submit(locationTask);
            }
        }

        // Ожидание завершения всех задач
        if (!latch.await(15, TimeUnit.SECONDS)) {
            System.err.println("Некоторые задачи не успели завершиться вовремя");
        }

        // Завершаем работу пула потоков
        ses.shutdown();

        // Проверка завершения всех задач
        if (!ses.awaitTermination(10, TimeUnit.SECONDS)) {
            System.err.println("Некоторые задачи не завершились вовремя");
        } else {
            System.out.println("Все задачи завершены.");
        }

        // Итоговая статистика
        System.out.println("Общее количество завершенных циклов для всех локаций: " + completedCycles.get());
    }
}

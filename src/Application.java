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


                Runnable locationTask = () -> {
                    try {
                        int totalCycles = location.lifeCycles; // Получаем количество циклов из настроек локации
                        AtomicInteger localCompletedCycles = new AtomicInteger(0);

                        System.out.println("Запуск циклов для локации [" + column + ", " + row + "] с " + totalCycles + " циклами.");

                        // Выполнение жизненного цикла для локации
                        for (int cycle = 0; cycle < totalCycles; cycle++) {
                            System.out.println("Цикл " + cycle + " для локации [" + column + ", " + row + "]...");

                            // Проводим цикл только если есть живые животные
                            if (!location.getAnimals().isEmpty()) {
                                // Проверка, все ли животные мертвы
                                boolean allDead = location.getAnimals().stream().allMatch(animal -> !animal.isAlive());

                                if (allDead) {
                                    // Если все животные мертвы, останавливаем программу
                                    System.out.println("Все животные на локации [" + column + ", " + row + "] мертвы. Завершаем выполнение программы.");
                                    System.out.println("Общее количество завершенных циклов: " + completedCycles.get());

                                }

                                location.run();  // Выполнение всех действий для животных в локации
                                localCompletedCycles.incrementAndGet();
                                System.out.println("Цикл " + cycle + " завершен.");
                            } else {
                                break; // Если локация пуста, завершаем выполнение циклов
                            }
                        }

                        // Результат для текущей локации, только если были выполнены циклы с живыми животными
                        if (localCompletedCycles.get() > 0) {
                            System.out.println("Локация [" + column + ", " + row + "] завершила " + localCompletedCycles.get() + " циклов.");
                            completedCycles.addAndGet(localCompletedCycles.get());
                        }

                        // Уменьшаем латч, обозначая завершение задачи для этой локации
                        latch.countDown();

                        // Задержка перед выводом следующей локации (можно исключить если не требуется)
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
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

import config.Settings;
import entity.Island;
import entity.Location;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.AtomicInteger;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        Island island = new Island(Settings.columnsCount, Settings.rowsCount); // остров
        island.createLocations(); // Создание локаций
        Location[][] location = island.getLocations(); // Инициализация массива локаций

        // Пул потоков с 4 потоками
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(4);

        // Латч для ожидания завершения всех потоков
        CountDownLatch latch = new CountDownLatch(Settings.columnsCount * Settings.rowsCount);

        // Для корректного увеличения числа циклов
        AtomicInteger completedCycles = new AtomicInteger(0);

        // Создаем ReentrantLock для обеспечения последовательности
        Lock lock = new ReentrantLock();

        // Запуск обработки локаций по порядку (по одной каждую 3 секунды)
        for (int i = 0; i < Settings.columnsCount; i++) {
            for (int j = 0; j < Settings.rowsCount; j++) {
                final int column = i;
                final int row = j;

                // Локация для текущего потока
                final Location currentLocation = location[i][j];

                Runnable locationTask = () -> {
                    try {
                        lock.lock(); // Захват блокировки для последовательного выполнения задач

                        int totalCycles = currentLocation.lifeCycles;
                        AtomicInteger localCompletedCycles = new AtomicInteger(0);

                        // Выполнение жизненного цикла для локации
                        for (int cycle = 0; cycle < totalCycles; cycle++) {
                            if (!currentLocation.getAnimals().isEmpty()) {
                                currentLocation.run(); // Запуск жизненного цикла
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
                    } finally {
                        lock.unlock(); // Освобождаем блокировку
                    }
                };

                // Запускаем задачу для текущей локации в пуле потоков
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
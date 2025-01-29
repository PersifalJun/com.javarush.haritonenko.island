
import config.Settings;
import entity.Island;
import entity.Location;
import util.Statistics;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class Application {

    public static void main(String[] args) throws InterruptedException {



        //Остров - ячейки локаций - пока не реализовано нормальным образом
        Island island = new Island(Settings.columnsCount, Settings.rowsCount);
        Location[][] location1 = island.getLocations();


        Location location = new Location(); // Создание локации
        Statistics statistics = new Statistics(); //Статистика

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(6); // Пул на 3 потока

        AtomicInteger completedCycles = new AtomicInteger(0);

        Runnable locationTask = () -> {
            ThreadLocalRandom localRandom = ThreadLocalRandom.current();
            // Планируем задачи на каждый цикл
            for (int i = 0; i < location.lifeCycles; i++) {
                if (!location.getAnimals().isEmpty()) {
                    location.run();
                    completedCycles.incrementAndGet();


                } else {
                    System.out.println("Локация пуста");
                    System.out.println("Жизнь на острове завершена " + "совершено" + completedCycles.get() + " циклов.");
                    ses.shutdown();
                    return; // Прерываем выполнение
                }
            }
            };

            //Runnable statisticsTask = statistics::run;

            ses.scheduleAtFixedRate(locationTask, 0, 5, TimeUnit.SECONDS); // Запуск каждую секунду
            //ses.scheduleAtFixedRate(statisticsTask, 1, 5, TimeUnit.SECONDS); // Запуск статистики каждую секунду со смещением


                //жидание завершения всех задач
                ses.schedule(() -> {
                    ses.shutdown();
                    try {
                        if (!ses.awaitTermination(10, TimeUnit.SECONDS)) {
                            System.err.println("Некоторые задачи не успели завершиться вовремя");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Все задачи завершены");
                }, location.lifeCycles * 5L, TimeUnit.SECONDS);
            };

        }



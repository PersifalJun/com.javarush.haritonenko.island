
import entity.Location;
import util.Statistics;

import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class Application {
    static Statistics statistics = new Statistics();


    public static void main(String[] args) throws InterruptedException {

        Location location = new Location(); // Создание локации

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(3); // Пул на 3 потока
        ThreadLocalRandom random = ThreadLocalRandom.current();


        AtomicInteger cyclesQuantity = new AtomicInteger(0);

        Runnable task = () -> {
            ThreadLocalRandom localRandom = ThreadLocalRandom.current();
            // Планируем задачи на каждый цикл
            for (int i = 0; i < location.lifeCycles; i++) {
                ses.schedule(() -> {
                    if (!location.getAnimals().isEmpty()) {


                        ses.submit(location::animalAndPlantLifeCycle);
                        ses.submit(statistics::printStatistics);


                        statistics.printStatistics();
                        cyclesQuantity.incrementAndGet();
                    }
                    else{
                        System.out.println("Локация пуста");
                        System.out.println("Жизнь на острове завершена " + "совершено" + cyclesQuantity.get() + " циклов.");
                        ses.shutdown();
                        return; // Прерываем выполнение
                    }

                    statistics.printStatistics();
                    cyclesQuantity.incrementAndGet();

                    if (cyclesQuantity.get() >= location.lifeCycles) {
                        ses.shutdown();
                        System.out.println("Жизнь на острове завершена " + "совершено" + cyclesQuantity.get() + " циклов.");
                    }
                }, i * 5, TimeUnit.SECONDS); // Запускаем каждый цикл через 5 секунд
            }

            // Дожидаемся завершения работы executor-а
            try {
                ses.awaitTermination(location.lifeCycles * 5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

    }
}

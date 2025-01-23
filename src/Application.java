
import entity.Location;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Application {


    public static void main(String[] args) throws InterruptedException {

        Location location = new Location(); // Создание локации

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(2); // Пул на 2 потока
        ThreadLocalRandom random = ThreadLocalRandom.current();

        // Вывод начальной информации
        System.out.println("Начальная статистика:");
        

        //Вывод начального кол-ва животных и растений.
        Map<String, Long> AnimalsInfo = location.getAnimals().
                stream().collect(Collectors.groupingBy(animal -> animal.getClass().getSimpleName(), Collectors.counting()));
        int plantCount = location.getPlants().size();

        AnimalsInfo.forEach((animal, count) -> System.out.println("  " + animal + ": " + count));
        System.out.println("Plants: " + plantCount);

        int cycles = 20;   // Кол-во жизненных циклов
        AtomicInteger cycleCounter = new AtomicInteger(0);

        // Планируем задачи на каждый цикл
        for (int i = 0; i < cycles; i++) {
            ses.schedule(() -> {
                if (location.getAnimals().isEmpty()) {
                    System.out.println("Локация пуста");
                    System.out.println("Жизнь на острове завершена " + cycleCounter.get() + " циклов.");
                    ses.shutdown();
                    return; // Прерываем выполнение
                }

                // Запускаем действия животных и растений в отдельных потоках
                ses.submit(location::AnimalAndPlantLifeCycle);
                ses.submit(location::printStatistics);


                // Выводим статистику
                location.printStatistics();
                cycleCounter.incrementAndGet();

                if (cycleCounter.get() >= cycles) {
                    ses.shutdown();
                    System.out.println("Жизнь на острове завершена " + cycles + " циклов.");
                }
            }, i * 5, TimeUnit.SECONDS); // Запускаем каждый цикл через 5 секунд
        }

        // Дожидаемся завершения работы executor-а
        ses.awaitTermination(cycles * 5, TimeUnit.SECONDS);

    }
}

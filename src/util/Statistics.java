package util;

import entity.Location;
import entity.creature.animal.herbivor.*;
import entity.creature.animal.predator.*;

import java.util.Map;
import java.util.stream.Collectors;

public class Statistics implements Runnable{
    Location location = new Location();

    public void printStatistics() {

        // Вывод начальной информации
        System.out.println("Начальная статистика:");

        //Вывод начального кол-ва животных и растений.
        Map<String, Long> AnimalsInfo = location.getAnimals().
                stream().collect(Collectors.groupingBy(animal -> animal.getClass().getSimpleName(), Collectors.counting()));
        int plantCount = location.getPlants().size();

        AnimalsInfo.forEach((animal, count) -> System.out.println("  " + animal + ": " + count));
        System.out.println("Plants: " + plantCount);

        System.out.println("Статистика:");
        System.out.println("-".repeat(100));
        System.out.println("Animals:" + location.getAnimals().size());
        System.out.println("Хищные звери");
        System.out.println();
        System.out.println("Wolves: " + location.getAnimals().stream().filter(p -> p instanceof Wolf).count());
        System.out.println("Boas: " + location.getAnimals().stream().filter(p -> p instanceof Boa).count());
        System.out.println("Foxes: " + location.getAnimals().stream().filter(p -> p instanceof Fox).count());
        System.out.println("Bears: " + location.getAnimals().stream().filter(p -> p instanceof Bear).count());
        System.out.println("Eagles: " + location.getAnimals().stream().filter(p -> p instanceof Eagle).count());
        System.out.println();
        System.out.println("Травоядные звери");
        System.out.println();
        System.out.println("Horses: " + location.getAnimals().stream().filter(p -> p instanceof Horse).count());
        System.out.println("Deers: " + location.getAnimals().stream().filter(p -> p instanceof Deer).count());
        System.out.println("Rabbits: " + location.getAnimals().stream().filter(p -> p instanceof Rabbit).count());
        System.out.println("Mice: " + location.getAnimals().stream().filter(p -> p instanceof Mouse).count());
        System.out.println("Goats: " + location.getAnimals().stream().filter(p -> p instanceof Goat).count());
        System.out.println("Sheeps: " + location.getAnimals().stream().filter(p -> p instanceof Sheep).count());
        System.out.println("Buffalos: " + location.getAnimals().stream().filter(p -> p instanceof Buffalo).count());
        System.out.println("Hogs: " + location.getAnimals().stream().filter(p -> p instanceof Hog).count());
        System.out.println("Ducks: " + location.getAnimals().stream().filter(p -> p instanceof Duck).count());
        System.out.println("Caterpillars: " + location.getAnimals().stream().filter(p -> p instanceof Caterpillar).count());
        System.out.println("Plants: " + location.getPlants().size());

        System.out.println("-".repeat(100));
    }


    @Override
    public void run() {
        printStatistics();
    }
}

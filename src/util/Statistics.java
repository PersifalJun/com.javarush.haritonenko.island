package util;


import entity.creature.animal.Animal;
import entity.creature.plant.Plant;
import entity.creature.animal.herbivor.*;
import entity.creature.animal.predator.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistics {

    private Map<Class<? extends Animal>, Integer> animalCounts; // Количество животных по видам
    private int totalPlants; // Общее количество растений

    public Statistics() {
        this.animalCounts = new HashMap<>();
        this.totalPlants = 0;
    }

    public void updateAnimals(List<Animal> animals) {
        // Очищаем предыдущую статистику
        animalCounts.clear();

        // Обновляем статистику по каждому виду животных
        for (Animal animal : animals) {
            Class<? extends Animal> animalClass = animal.getClass();
            animalCounts.put(animalClass, animalCounts.getOrDefault(animalClass, 0) + 1);
        }
    }

    // Метод для обновления статистики растений
    public void updatePlants(List<Plant> plants) {
        totalPlants = plants.size(); // Обновляем общее количество растений
    }

    // Метод для вывода статистики по количеству животных на конец дня
    public void printDailyStatistics(List<Animal> animals) {
        System.out.println("==== Статистика  на конец дня ====");
        System.out.println("Осталось животных:" + animals.size());
        System.out.println("Хищные звери");
        System.out.println();
        System.out.println("Wolves: " + animals.stream().filter(p -> p instanceof Wolf).count());
        System.out.println("Boas: " +animals.stream().filter(p -> p instanceof Boa).count());
        System.out.println("Foxes: " + animals.stream().filter(p -> p instanceof Fox).count());
        System.out.println("Bears: " +animals.stream().filter(p -> p instanceof Bear).count());
        System.out.println("Eagles: " +animals.stream().filter(p -> p instanceof Eagle).count());
        System.out.println();
        System.out.println("Травоядные звери");
        System.out.println();
        System.out.println("Horses: " + animals.stream().filter(p -> p instanceof Horse).count());
        System.out.println("Deers: " + animals.stream().filter(p -> p instanceof Deer).count());
        System.out.println("Rabbits: " + animals.stream().filter(p -> p instanceof Rabbit).count());
        System.out.println("Mice: " + animals.stream().filter(p -> p instanceof Mouse).count());
        System.out.println("Goats: " + animals.stream().filter(p -> p instanceof Goat).count());
        System.out.println("Sheeps: " + animals.stream().filter(p -> p instanceof Sheep).count());
        System.out.println("Hogs: " + animals.stream().filter(p -> p instanceof Hog).count());
        System.out.println("Buffalos: " + animals.stream().filter(p -> p instanceof Buffalo).count());
        System.out.println("Ducks: " + animals.stream().filter(p -> p instanceof Duck).count());
        System.out.println("Caterpillars: " + animals.stream().filter(p -> p instanceof Caterpillar).count());
        System.out.println("-".repeat(100));
        System.out.println("Общее количество растений: " + totalPlants);
        System.out.println("-".repeat(50));
    }


}
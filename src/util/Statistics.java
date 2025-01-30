package util;

import entity.creature.animal.Animal;
import entity.creature.plant.Plant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistics {

    private int totalAnimals; // Общее количество животных
    private int totalPlants;  // Общее количество растений
    private Map<Class<? extends Animal>, Integer> animalsCount; // Счетчик для каждого вида животных

    public Statistics() {
        totalAnimals = 0;
        totalPlants = 0;
        animalsCount = new HashMap<>();
    }

    // Метод для обновления статистики животных
    public void updateAnimals(List<Animal> animals) {
        totalAnimals = animals.size(); // Обновляем общее количество животных

        // Обновляем количество каждого вида животных
        animalsCount.clear();
        for (Animal animal : animals) {
            Class<? extends Animal> animalClass = animal.getClass();
            animalsCount.put(animalClass, animalsCount.getOrDefault(animalClass, 0) + 1);
        }
    }

    // Метод для обновления статистики растений
    public void updatePlants(List<Plant> plants) {
        totalPlants = plants.size(); // Обновляем общее количество растений
    }

    // Метод для вывода статистики
    public void printStatistics() {
        System.out.println("Общее количество животных: " + totalAnimals);
        System.out.println("Общее количество растений: " + totalPlants);

        // Выводим количество каждого вида животных
        System.out.println("Количество животных по видам:");
        for (Map.Entry<Class<? extends Animal>, Integer> entry : animalsCount.entrySet()) {
            System.out.println(entry.getKey().getSimpleName() + ": " + entry.getValue());
        }
        System.out.println("-".repeat(100)); // Разделитель
    }

    // Геттеры
    public int getTotalAnimals() {
        return totalAnimals;
    }

    public int getTotalPlants() {
        return totalPlants;
    }

    public Map<Class<? extends Animal>, Integer> getAnimalsCount() {
        return animalsCount;
    }
}
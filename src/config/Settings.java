package config;

import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.animal.herbivor.*;
import entity.creature.animal.predator.*;
import entity.creature.plant.Plant;

import java.util.HashMap;
import java.util.Map;

public class Settings {

    public final static int lifeCycles = 15; //Кол-во циклов

    public int getLifeCycles() {
        return lifeCycles;
    }

    //Размер острова
    public final static int columnsCount = 4;           //Можно менять и ставить 100
    public final static int rowsCount = 4;              //Можно менять и ставить 20 , но будет очень долгий вывод

    // Характеристики для растений на 1 локации
    public final static int maxPlantCount = 200;
    public final static int maxPlantWeight = 1;


    //Кол-во животных на старте симуляции (кол-во животных на одной клетке)
    public final static int maxWolfCount = 30;
    public final static int maxFoxCount = 30;
    public final static int maxEagleCount = 20;
    public final static int maxBoaCount = 30;
    public final static int maxBearCount = 5;
    public final static int maxSheepCount = 140;
    public final static int maxRabbitCount = 150;
    public final static int maxMouseCount = 500;
    public final static int maxHorseCount = 20;
    public final static int maxHogCount = 50;
    public final static int maxGoatCount = 140;
    public final static int maxDuckCount = 200;
    public final static int maxDeerCount = 20;
    public final static int maxCaterpillarCount = 100; // Вообще их 1000 но в консоли очень много выводится;
    public final static int maxBuffaloCount = 10;


    // Метод для получения максимального количества для конкретного класса животного
    public static int getMaxCount(Class<?> animalClass) {
        if (animalClass == Wolf.class) {
            return maxWolfCount;
        } else if (animalClass == Fox.class) {
            return maxFoxCount;
        } else if (animalClass == Bear.class) {
            return maxBearCount;
        } else if (animalClass == Boa.class) {
            return maxBoaCount;
        } else if (animalClass == Eagle.class) {
            return maxEagleCount;
        } else if (animalClass == Sheep.class) {
            return maxSheepCount;
        } else if (animalClass == Rabbit.class) {
            return maxRabbitCount;
        } else if (animalClass == Mouse.class) {
            return maxMouseCount;
        } else if (animalClass == Horse.class) {
            return maxHorseCount;
        } else if (animalClass == Hog.class) {
            return maxHogCount;
        } else if (animalClass == Goat.class) {
            return maxGoatCount;
        } else if (animalClass == Duck.class) {
            return maxDuckCount;
        } else if (animalClass == Deer.class) {
            return maxDeerCount;
        } else if (animalClass == Buffalo.class) {
            return maxBuffaloCount;
        } else if (animalClass == Caterpillar.class) {
            return maxCaterpillarCount;
        } else if (animalClass == Plant.class) {
            return maxPlantCount;
        }

        // Если тип животного не найден, возвращаем 0 (по умолчанию)
        return 0;
    }


    //Максимальное количество всех зверей
    public static final int maxCountAnimals = maxWolfCount + maxFoxCount + maxBearCount + maxBoaCount+
              maxEagleCount + maxSheepCount + maxRabbitCount +
             maxMouseCount + maxHorseCount + maxHogCount+
            + maxGoatCount + maxDuckCount + maxDeerCount+
            + maxBuffaloCount + maxCaterpillarCount;

    //Максимальный вес каждого животного :
    public final static double maxWolfWeight = 50;
    public final static double maxFoxWeight = 8;
    public final static double maxEagleWeight = 6;
    public final static double maxBoaWeight = 15;
    public final static double maxBearWeight = 500;
    public final static double maxSheepWeight = 70;
    public final static double maxRabbitWeight = 2;
    public final static double maxMouseWeight = 0.05;
    public final static double maxHorseWeight = 400;
    public final static double maxHogWeight = 400;
    public final static double maxGoatWeight = 60;
    public final static double maxDuckWeight = 1;
    public final static double maxDeerWeight = 300;
    public final static double maxCaterpillarWeight = 0.01;
    public final static double maxBuffaloWeight = 700;


    //Максимальная скорость перемещения животных :
    public final static int maxWolfSpeed = 3;
    public final static int maxFoxSpeed = 2;
    public final static int maxEagleSpeed = 3;
    public final static int maxBoaSpeed= 1;
    public final static int maxBearSpeed = 2;
    public final static int maxSheepSpeed = 3;
    public final static int maxRabbitSpeed = 2;
    public final static int maxMouseSpeed = 1;
    public final static int maxHorseSpeed = 4;
    public final static int maxHogSpeed = 2;
    public final static int maxGoatSpeed = 3;
    public final static int maxDuckSpeed = 4;
    public final static int maxDeerSpeed = 4;
    public final static int maxCaterpillarSpeed = 0;
    public final static int maxBuffaloSpeed = 3;

    //Кг пищи до полного насыщения  для каждого животного
    public final static double WolfFullSatiety = 8;
    public final static double FoxFullSatiety = 2;
    public final static double EagleFullSatiety = 1;
    public final static double BoaFullSatiety= 3;
    public final static double BearFullSatiety = 80;
    public final static double SheepFullSatiety = 15;
    public final static double RabbitFullSatiety = 0.45;
    public final static double MouseFullSatiety = 0.01;
    public final static double HorseFullSatiety = 60;
    public final static double HogFullSatiety = 50;
    public final static double GoatFullSatiety = 10;
    public final static double DuckFullSatiety= 0.15;
    public final static double DeerFullSatiety = 50;
    public final static double CaterpillarFullSatiety = 0;
    public final static double BuffaloFullSatiety = 100;


    //Кол-во детенышей у каждого животного - в доработке
    public final static int maxWolfСubCount = 1;
    public final static int maxFoxCubCount = 1;
    public final static int maxEagleCubCount = 1;
    public final static int maxBoaCubCount = 1;
    public final static int maxBearCubCount = 1;
    public final static int maxSheepCubCount = 1;
    public final static int maxRabbitCubCount = 1;
    public final static int maxMouseCubCount = 1;
    public final static int maxHorseCubCount = 1;
    public final static int maxHogCubCount = 1;
    public final static int maxGoatCubCount = 1;
    public final static int maxDuckCubCount = 1;
    public final static int maxDeerCubCount = 1;
    public final static int maxCaterpillarCubCount = 1;
    public final static int maxBuffaloCubCount = 1;





    //Условия вероятности поедания

    //У волка
    public static final int probabilytyWolfEatWolf = 0;
    public static final int probabilytyWolfEatBoa = 0;
    public static final int probabilytyWolfEatFox = 0;
    public static final int probabilytyWolfEatBear = 0;
    public static final int probabilytyWolfEatEagle = 0;
    public static final int probabilytyWolfEatHorse = 10;
    public static final int probabilytyWolfEatDeer = 15;
    public static final int probabilytyWolfEatRabbit = 60;
    public static final int probabilytyWolfEatMouse = 80;
    public static final int probabilytyWolfEatGoat = 60;
    public static final int probabilytyWolfEatSheep = 70;
    public static final int probabilytyWolfEatHog = 15;
    public static final int probabilytyWolfEatBuffalo = 10;
    public static final int probabilytyWolfEatDuck = 40;
    public static final int probabilytyWolfEatCaterpillar = 0;
    public static final int probabilytyWolfEatPlant = 0;

    //У удава
    public static final int probabilytyBoaEatWolf = 0;
    public static final int probabilytyBoaEatBoa = 0;
    public static final int probabilytyBoaEatFox = 15;
    public static final int probabilytyBoaEatBear = 0;
    public static final int probabilytyBoaEatEagle = 0;
    public static final int probabilytyBoaEatHorse = 0;
    public static final int probabilytyBoaEatDeer = 0;
    public static final int probabilytyBoaEatRabbit = 20;
    public static final int probabilytyBoaEatMouse = 40;
    public static final int probabilytyBoaEatGoat = 0;
    public static final int probabilytyBoaEatSheep = 0;
    public static final int probabilytyBoaEatHog = 0;
    public static final int probabilytyBoaEatBuffalo = 0;
    public static final int probabilytyBoaEatDuck = 10;
    public static final int probabilytyBoaEatCaterpillar = 0;
    public static final int probabilytyBoaEatPlant = 0;

    //У лисы
    public static final int probabilytyFoxEatWolf = 0;
    public static final int probabilytyFoxEatBoa = 0;
    public static final int probabilytyFoxEatFox = 0;
    public static final int probabilytyFoxEatBear = 0;
    public static final int probabilytyFoxEatEagle = 0;
    public static final int probabilytyFoxEatHorse = 0;
    public static final int probabilytyFoxEatDeer = 0;
    public static final int probabilytyFoxEatRabbit = 70;
    public static final int probabilytyFoxEatMouse = 90;
    public static final int probabilytyFoxEatGoat = 0;
    public static final int probabilytyFoxEatSheep = 0;
    public static final int probabilytyFoxEatHog = 0;
    public static final int probabilytyFoxEatBuffalo = 0;
    public static final int probabilytyFoxEatDuck = 60;
    public static final int probabilytyFoxEatCaterpillar = 40;
    public static final int probabilytyFoxEatPlant = 0;

    //У медведя
    public static final int probabilytyBearEatWolf = 0;
    public static final int probabilytyBearEatBoa = 80;
    public static final int probabilytyBearEatFox = 0;
    public static final int probabilytyBearEatBear = 0;
    public static final int probabilytyBearEatEagle = 0;
    public static final int probabilytyBearEatHorse = 40;
    public static final int probabilytyBearEatDeer = 80;
    public static final int probabilytyBearEatRabbit = 80;
    public static final int probabilytyBearEatMouse = 90;
    public static final int probabilytyBearEatGoat = 70;
    public static final int probabilytyBearEatSheep = 70;
    public static final int probabilytyBearEatHog = 50;
    public static final int probabilytyBearEatBuffalo = 20;
    public static final int probabilytyBearEatDuck = 10;
    public static final int probabilytyBearEatCaterpillar = 0;
    public static final int probabilytyBearEatPlant = 0;


    //У орла
    public static final int probabilytyEagleEatWolf = 0;
    public static final int probabilytyEagleEatBoa = 0;
    public static final int probabilytyEagleEatFox = 10;
    public static final int probabilytyEagleEatBear = 0;
    public static final int probabilytyEagleEatEagle = 0;
    public static final int probabilytyEagleEatHorse = 0;
    public static final int probabilytyEagleEatDeer = 0;
    public static final int probabilytyEagleEatRabbit = 90;
    public static final int probabilytyEagleEatMouse = 90;
    public static final int probabilytyEagleEatGoat = 0;
    public static final int probabilytyEagleEatSheep = 0;
    public static final int probabilytyEagleEatHog = 0;
    public static final int probabilytyEagleEatBuffalo = 0;
    public static final int probabilytyEagleEatDuck = 80;
    public static final int probabilytyEagleEatCaterpillar = 0;
    public static final int probabilytyEagleEatPlant = 0;


    //У лошади
    public static final int probabilytyHorseEatWolf = 0;
    public static final int probabilytyHorseEatBoa = 0;
    public static final int probabilytyHorseEatFox = 0;
    public static final int probabilytyHorseEatBear = 0;
    public static final int probabilytyHorseEatEagle = 0;
    public static final int probabilytyHorseEatHorse = 0;
    public static final int probabilytyHorseEatDeer = 0;
    public static final int probabilytyHorseEatRabbit = 0;
    public static final int probabilytyHorseEatMouse = 0;
    public static final int probabilytyHorseEatGoat = 0;
    public static final int probabilytyHorseEatSheep = 0;
    public static final int probabilytyHorseEatHog = 0;
    public static final int probabilytyHorseEatBuffalo = 0;
    public static final int probabilytyHorseEatDuck = 0;
    public static final int probabilytyHorseEatCaterpillar = 0;
    public static final int probabilytyHorseEatPlant = 100;

    //У оленя
    public static final int probabilytyDeerEatWolf = 0;
    public static final int probabilytyDeerEatBoa = 0;
    public static final int probabilytyDeerEatFox = 0;
    public static final int probabilytyDeerEatBear = 0;
    public static final int probabilytyDeerEatEagle = 0;
    public static final int probabilytyDeerEatHorse = 0;
    public static final int probabilytyDeerEatDeer = 0;
    public static final int probabilytyDeerEatRabbit = 0;
    public static final int probabilytyDeerEatMouse = 0;
    public static final int probabilytyDeerEatGoat = 0;
    public static final int probabilytyDeerEatSheep = 0;
    public static final int probabilytyDeerEatHog = 0;
    public static final int probabilytyDeerEatBuffalo = 0;
    public static final int probabilytyDeerEatDuck = 0;
    public static final int probabilytyDeerEatCaterpillar = 0;
    public static final int probabilytyDeerEatPlant = 100;

    //У кролика
    public static final int probabilytyRabbitEatWolf = 0;
    public static final int probabilytyRabbitEatBoa = 0;
    public static final int probabilytyRabbitEatFox = 0;
    public static final int probabilytyRabbitEatBear = 0;
    public static final int probabilytyRabbitEatEagle = 0;
    public static final int probabilytyRabbitEatHorse = 0;
    public static final int probabilytyRabbitEatDeer = 0;
    public static final int probabilytyRabbitEatRabbit = 0;
    public static final int probabilytyRabbitEatMouse = 0;
    public static final int probabilytyRabbitEatGoat = 0;
    public static final int probabilytyRabbitEatSheep = 0;
    public static final int probabilytyRabbitEatHog = 0;
    public static final int probabilytyRabbitEatBuffalo = 0;
    public static final int probabilytyRabbitEatDuck = 0;
    public static final int probabilytyRabbitEatCaterpillar = 0;
    public static final int probabilytyRabbitEatPlant = 100;

    //У мыши
    public static final int probabilytyMouseEatWolf = 0;
    public static final int probabilytyMouseEatBoa = 0;
    public static final int probabilytyMouseEatFox = 0;
    public static final int probabilytyMouseEatBear = 0;
    public static final int probabilytyMouseEatEagle = 0;
    public static final int probabilytyMouseEatHorse = 0;
    public static final int probabilytyMouseEatDeer = 0;
    public static final int probabilytyMouseEatRabbit = 0;
    public static final int probabilytyMouseEatMouse = 0;
    public static final int probabilytyMouseEatGoat = 0;
    public static final int probabilytyMouseEatSheep = 0;
    public static final int probabilytyMouseEatHog = 0;
    public static final int probabilytyMouseEatBuffalo = 0;
    public static final int probabilytyMouseEatDuck = 0;
    public static final int probabilytyMouseEatCaterpillar = 90;
    public static final int probabilytyMouseEatPlant = 100;

    //У козы
    public static final int probabilytyGoatEatWolf = 0;
    public static final int probabilytyGoatEatBoa = 0;
    public static final int probabilytyGoatEatFox = 0;
    public static final int probabilytyGoatEatBear = 0;
    public static final int probabilytyGoatEatEagle = 0;
    public static final int probabilytyGoatEatHorse = 0;
    public static final int probabilytyGoatEatDeer = 0;
    public static final int probabilytyGoatEatRabbit = 0;
    public static final int probabilytyGoatEatMouse = 0;
    public static final int probabilytyGoatEatGoat = 0;
    public static final int probabilytyGoatEatSheep = 0;
    public static final int probabilytyGoatEatHog = 0;
    public static final int probabilytyGoatEatBuffalo = 0;
    public static final int probabilytyGoatEatDuck = 0;
    public static final int probabilytyGoatEatCaterpillar = 0;
    public static final int probabilytyGoatEatPlant = 100;

    //У овцы
    public static final int probabilytySheepEatWolf = 0;
    public static final int probabilytySheepEatBoa = 0;
    public static final int probabilytySheepEatFox = 0;
    public static final int probabilytySheepEatBear = 0;
    public static final int probabilytySheepEatEagle = 0;
    public static final int probabilytySheepEatHorse = 0;
    public static final int probabilytySheepEatDeer = 0;
    public static final int probabilytySheepEatRabbit = 0;
    public static final int probabilytySheepEatMouse = 0;
    public static final int probabilytySheepEatGoat = 0;
    public static final int probabilytySheepEatSheep = 0;
    public static final int probabilytySheepEatHog = 0;
    public static final int probabilytySheepEatBuffalo = 0;
    public static final int probabilytySheepEatDuck = 0;
    public static final int probabilytySheepEatCaterpillar = 0;
    public static final int probabilytySheepEatPlant = 100;

    //У кабана
    public static final int probabilytyHogEatWolf = 0;
    public static final int probabilytyHogEatBoa = 0;
    public static final int probabilytyHogEatFox = 0;
    public static final int probabilytyHogEatBear = 0;
    public static final int probabilytyHogEatEagle = 0;
    public static final int probabilytyHogEatHorse = 0;
    public static final int probabilytyHogEatDeer = 0;
    public static final int probabilytyHogEatRabbit = 0;
    public static final int probabilytyHogEatMouse = 50;
    public static final int probabilytyHogEatGoat = 0;
    public static final int probabilytyHogEatSheep = 0;
    public static final int probabilytyHogEatHog = 0;
    public static final int probabilytyHogEatBuffalo = 0;
    public static final int probabilytyHogEatDuck = 0;
    public static final int probabilytyHogEatCaterpillar = 90;
    public static final int probabilytyHogEatPlant = 100;

    //У буйвала
    public static final int probabilytyBuffaloEatWolf = 0;
    public static final int probabilytyBuffaloEatBoa = 0;
    public static final int probabilytyBuffaloEatFox = 0;
    public static final int probabilytyBuffaloEatBear = 0;
    public static final int probabilytyBuffaloEatEagle = 0;
    public static final int probabilytyBuffaloEatHorse = 0;
    public static final int probabilytyBuffaloEatDeer = 0;
    public static final int probabilytyBuffaloEatRabbit = 0;
    public static final int probabilytyBuffaloEatMouse = 0;
    public static final int probabilytyBuffaloEatGoat = 0;
    public static final int probabilytyBuffaloEatSheep = 0;
    public static final int probabilytyBuffaloEatHog = 0;
    public static final int probabilytyBuffaloEatBuffalo = 0;
    public static final int probabilytyBuffaloEatDuck = 0;
    public static final int probabilytyBuffaloEatCaterpillar = 0;
    public static final int probabilytyBuffaloEatPlant = 100;

    //У утки
    public static final int probabilytyDuckEatWolf = 0;
    public static final int probabilytyDuckEatBoa = 0;
    public static final int probabilytyDuckEatFox = 0;
    public static final int probabilytyDuckEatBear = 0;
    public static final int probabilytyDuckEatEagle = 0;
    public static final int probabilytyDuckEatHorse = 0;
    public static final int probabilytyDuckEatDeer = 0;
    public static final int probabilytyDuckEatRabbit = 0;
    public static final int probabilytyDuckEatMouse = 0;
    public static final int probabilytyDuckEatGoat = 0;
    public static final int probabilytyDuckEatSheep = 0;
    public static final int probabilytyDuckEatHog = 0;
    public static final int probabilytyDuckEatBuffalo = 0;
    public static final int probabilytyDuckEatDuck = 0;
    public static final int probabilytyDuckEatCaterpillar = 90;
    public static final int probabilytyDuckEatPlant = 100;

    //У гусеницы
    public static final int probabilytyCaterpillarEatWolf = 0;
    public static final int probabilytyCaterpillarEatBoa = 0;
    public static final int probabilytyCaterpillarEatFox = 0;
    public static final int probabilytyCaterpillarEatBear = 0;
    public static final int probabilytyCaterpillarEatEagle = 0;
    public static final int probabilytyCaterpillarEatHorse = 0;
    public static final int probabilytyCaterpillarEatDeer = 0;
    public  static final int probabilytyCaterpillarEatRabbit = 0;
    public static final int probabilytyCaterpillarEatMouse = 0;
    public static final int probabilytyCaterpillarEatGoat = 0;
    public static final int probabilytyCaterpillarEatSheep = 0;
    public static final int probabilytyCaterpillarEatHog = 0;
    public static final int probabilytyCaterpillarEatBuffalo = 0;
    public static final int probabilytyCaterpillarEatDuck = 0;
    public static final int probabilytyCaterpillarEatCaterpillar = 0;
    public static final int probabilytyCaterpillarEatPlant = 100;

    //Мапы с вероятностями

    //Мапа для хищников
    public static final Map<Class<? extends Creature>, Map<Class<? extends Creature>, Integer>> predatorProbabilities = new HashMap<>();
    static {
        // Заполняем вероятности для волка
        Map<Class<? extends Creature>, Integer> wolfPrey = new HashMap<>();

        wolfPrey.put(Horse.class, Settings.probabilytyWolfEatHorse);
        wolfPrey.put(Deer.class, Settings.probabilytyWolfEatDeer);
        wolfPrey.put(Rabbit.class,Settings.probabilytyWolfEatRabbit);
        wolfPrey.put(Mouse.class, Settings.probabilytyWolfEatMouse);
        wolfPrey.put(Goat.class, Settings.probabilytyWolfEatGoat);
        wolfPrey.put(Sheep.class, Settings.probabilytyWolfEatSheep);
        wolfPrey.put(Hog.class, Settings.probabilytyWolfEatHog);
        wolfPrey.put(Buffalo.class, Settings.probabilytyWolfEatBuffalo);
        wolfPrey.put(Duck.class, Settings.probabilytyWolfEatDuck);
        wolfPrey.put(Caterpillar.class, Settings.probabilytyWolfEatCaterpillar);
        wolfPrey.put(Bear.class, Settings.probabilytyWolfEatBear);
        wolfPrey.put(Boa.class, Settings.probabilytyWolfEatBoa);
        wolfPrey.put(Eagle.class, Settings.probabilytyWolfEatEagle);
        wolfPrey.put(Fox.class, Settings.probabilytyWolfEatFox);
        wolfPrey.put(Wolf.class, Settings.probabilytyWolfEatWolf);
        wolfPrey.put(Plant.class, Settings.probabilytyWolfEatPlant);

        predatorProbabilities.put(Wolf.class, wolfPrey);

        // Заполняем вероятности для удава
        Map<Class<? extends Creature>, Integer> boaPrey = new HashMap<>();

        boaPrey.put(Horse.class, Settings.probabilytyBoaEatHorse);
        boaPrey.put(Deer.class, Settings.probabilytyBoaEatDeer);
        boaPrey.put(Rabbit.class,Settings.probabilytyBoaEatRabbit);
        boaPrey.put(Mouse.class, Settings.probabilytyBoaEatMouse);
        boaPrey.put(Goat.class, Settings.probabilytyBoaEatGoat);
        boaPrey.put(Sheep.class, Settings.probabilytyBoaEatSheep);
        boaPrey.put(Hog.class, Settings.probabilytyBoaEatHog);
        boaPrey.put(Buffalo.class, Settings.probabilytyBoaEatBuffalo);
        boaPrey.put(Duck.class, Settings.probabilytyBoaEatDuck);
        boaPrey.put(Caterpillar.class, Settings.probabilytyBoaEatCaterpillar);
        boaPrey.put(Bear.class, Settings.probabilytyBoaEatBear);
        boaPrey.put(Boa.class, Settings.probabilytyBoaEatBoa);
        boaPrey.put(Eagle.class, Settings.probabilytyBoaEatEagle);
        boaPrey.put(Fox.class, Settings.probabilytyBoaEatFox);
        boaPrey.put(Wolf.class, Settings.probabilytyBoaEatWolf);
        boaPrey.put(Plant.class, Settings.probabilytyBoaEatPlant);

        predatorProbabilities.put(Boa.class, boaPrey);

        // Заполняем вероятности для лисы
        Map<Class<? extends Creature>, Integer> foxPrey = new HashMap<>();

        foxPrey.put(Horse.class, Settings.probabilytyFoxEatHorse);
        foxPrey.put(Deer.class, Settings.probabilytyFoxEatDeer);
        foxPrey.put(Rabbit.class,Settings.probabilytyFoxEatRabbit);
        foxPrey.put(Mouse.class, Settings.probabilytyFoxEatMouse);
        foxPrey.put(Goat.class, Settings.probabilytyFoxEatGoat);
        foxPrey.put(Sheep.class, Settings.probabilytyFoxEatSheep);
        foxPrey.put(Hog.class, Settings.probabilytyFoxEatHog);
        foxPrey.put(Buffalo.class, Settings.probabilytyFoxEatBuffalo);
        foxPrey.put(Duck.class, Settings.probabilytyFoxEatDuck);
        foxPrey.put(Caterpillar.class, Settings.probabilytyFoxEatCaterpillar);
        foxPrey.put(Bear.class, Settings.probabilytyFoxEatBear);
        foxPrey.put(Boa.class, Settings.probabilytyFoxEatBoa);
        foxPrey.put(Eagle.class, Settings.probabilytyFoxEatEagle);
        foxPrey.put(Fox.class, Settings.probabilytyFoxEatFox);
        foxPrey.put(Wolf.class, Settings.probabilytyFoxEatWolf);
        foxPrey.put(Plant.class, Settings.probabilytyFoxEatPlant);

        predatorProbabilities.put(Fox.class, foxPrey);

        // Заполняем вероятности для медведя
        Map<Class<? extends Creature>, Integer> bearPrey = new HashMap<>();

        bearPrey.put(Horse.class, Settings.probabilytyBearEatHorse);
        bearPrey.put(Deer.class, Settings.probabilytyBearEatDeer);
        bearPrey.put(Rabbit.class,Settings.probabilytyBearEatRabbit);
        bearPrey.put(Mouse.class, Settings.probabilytyBearEatMouse);
        bearPrey.put(Goat.class, Settings.probabilytyBearEatGoat);
        bearPrey.put(Sheep.class, Settings.probabilytyBearEatSheep);
        bearPrey.put(Hog.class, Settings.probabilytyBearEatHog);
        bearPrey.put(Buffalo.class, Settings.probabilytyBearEatBuffalo);
        bearPrey.put(Duck.class, Settings.probabilytyBearEatDuck);
        bearPrey.put(Caterpillar.class, Settings.probabilytyBearEatCaterpillar);
        bearPrey.put(Bear.class, Settings.probabilytyBearEatBear);
        bearPrey.put(Boa.class, Settings.probabilytyBearEatBoa);
        bearPrey.put(Eagle.class, Settings.probabilytyBearEatEagle);
        bearPrey.put(Fox.class, Settings.probabilytyBearEatFox);
        bearPrey.put(Wolf.class, Settings.probabilytyBearEatWolf);
        bearPrey.put(Plant.class, Settings.probabilytyBearEatPlant);


        predatorProbabilities.put(Bear.class, bearPrey);

        // Заполняем вероятности для орла
        Map<Class<? extends Creature>, Integer> eaglePrey = new HashMap<>();

        eaglePrey.put(Horse.class, Settings.probabilytyEagleEatHorse);
        eaglePrey.put(Deer.class, Settings.probabilytyEagleEatDeer);
        eaglePrey.put(Rabbit.class,Settings.probabilytyEagleEatRabbit);
        eaglePrey.put(Mouse.class, Settings.probabilytyEagleEatMouse);
        eaglePrey.put(Goat.class, Settings.probabilytyEagleEatGoat);
        eaglePrey.put(Sheep.class, Settings.probabilytyEagleEatSheep);
        eaglePrey.put(Hog.class, Settings.probabilytyEagleEatHog);
        eaglePrey.put(Buffalo.class, Settings.probabilytyEagleEatBuffalo);
        eaglePrey.put(Duck.class, Settings.probabilytyEagleEatDuck);
        eaglePrey.put(Caterpillar.class, Settings.probabilytyEagleEatCaterpillar);
        eaglePrey.put(Bear.class, Settings.probabilytyEagleEatBear);
        eaglePrey.put(Boa.class, Settings.probabilytyEagleEatBoa);
        eaglePrey.put(Eagle.class, Settings.probabilytyEagleEatEagle);
        eaglePrey.put(Fox.class, Settings.probabilytyEagleEatFox);
        eaglePrey.put(Wolf.class, Settings.probabilytyEagleEatWolf);
        eaglePrey.put(Plant.class, Settings.probabilytyEagleEatPlant);

        predatorProbabilities.put(Eagle.class, eaglePrey);
    }

    public static int getPredatorProbability(Class<? extends Creature> predator, Class<? extends Creature> prey) {
        return predatorProbabilities.getOrDefault(predator, new HashMap<>()).getOrDefault(prey, 0);
    }

    //Мапа для травоядных
    public static final Map<Class<? extends Creature>, Map<Class<? extends Creature>, Integer>> herbivorProbabilities = new HashMap<>();

    static {
        // Заполняем вероятности для буйвола
        Map<Class<? extends Creature>, Integer> buffaloPrey = new HashMap<>();

        buffaloPrey.put(Horse.class, Settings.probabilytyBuffaloEatHorse);
        buffaloPrey.put(Deer.class, Settings.probabilytyBuffaloEatDeer);
        buffaloPrey.put(Rabbit.class,Settings.probabilytyBuffaloEatRabbit);
        buffaloPrey.put(Mouse.class, Settings.probabilytyBuffaloEatMouse);
        buffaloPrey.put(Goat.class, Settings.probabilytyBuffaloEatGoat);
        buffaloPrey.put(Sheep.class, Settings.probabilytyBuffaloEatSheep);
        buffaloPrey.put(Hog.class, Settings.probabilytyBuffaloEatHog);
        buffaloPrey.put(Buffalo.class, Settings.probabilytyBuffaloEatBuffalo);
        buffaloPrey.put(Duck.class, Settings.probabilytyBuffaloEatDuck);
        buffaloPrey.put(Caterpillar.class, Settings.probabilytyBuffaloEatCaterpillar);
        buffaloPrey.put(Bear.class, Settings.probabilytyBuffaloEatBear);
        buffaloPrey.put(Boa.class, Settings.probabilytyBuffaloEatBoa);
        buffaloPrey.put(Eagle.class, Settings.probabilytyBuffaloEatEagle);
        buffaloPrey.put(Fox.class, Settings.probabilytyBuffaloEatFox);
        buffaloPrey.put(Wolf.class, Settings.probabilytyBuffaloEatWolf);
        buffaloPrey.put(Plant.class, Settings.probabilytyBuffaloEatPlant);

        herbivorProbabilities.put(Buffalo.class, buffaloPrey);

        // Заполняем вероятности для гусеницы
        Map<Class<? extends Creature>, Integer> caterpillarPrey = new HashMap<>();

        caterpillarPrey.put(Horse.class, Settings.probabilytyCaterpillarEatHorse);
        caterpillarPrey.put(Deer.class, Settings.probabilytyCaterpillarEatDeer);
        caterpillarPrey.put(Rabbit.class,Settings.probabilytyCaterpillarEatRabbit);
        caterpillarPrey.put(Mouse.class, Settings.probabilytyCaterpillarEatMouse);
        caterpillarPrey.put(Goat.class, Settings.probabilytyCaterpillarEatGoat);
        caterpillarPrey.put(Sheep.class, Settings.probabilytyCaterpillarEatSheep);
        caterpillarPrey.put(Hog.class, Settings.probabilytyCaterpillarEatHog);
        caterpillarPrey.put(Buffalo.class, Settings.probabilytyCaterpillarEatBuffalo);
        caterpillarPrey.put(Duck.class, Settings.probabilytyCaterpillarEatDuck);
        caterpillarPrey.put(Caterpillar.class, Settings.probabilytyCaterpillarEatCaterpillar);
        caterpillarPrey.put(Bear.class, Settings.probabilytyCaterpillarEatBear);
        caterpillarPrey.put(Boa.class, Settings.probabilytyCaterpillarEatBoa);
        caterpillarPrey.put(Eagle.class, Settings.probabilytyCaterpillarEatEagle);
        caterpillarPrey.put(Fox.class, Settings.probabilytyCaterpillarEatFox);
        caterpillarPrey.put(Wolf.class, Settings.probabilytyCaterpillarEatWolf);
        caterpillarPrey.put(Plant.class, Settings.probabilytyCaterpillarEatPlant);

        herbivorProbabilities.put(Caterpillar.class,  caterpillarPrey);

        // Заполняем вероятности для оленя
        Map<Class<? extends Creature>, Integer> deerPrey = new HashMap<>();

        deerPrey.put(Horse.class, Settings.probabilytyDeerEatHorse);
        deerPrey.put(Deer.class, Settings.probabilytyDeerEatDeer);
        deerPrey.put(Rabbit.class,Settings.probabilytyDeerEatRabbit);
        deerPrey.put(Mouse.class, Settings.probabilytyDeerEatMouse);
        deerPrey.put(Goat.class, Settings.probabilytyDeerEatGoat);
        deerPrey.put(Sheep.class, Settings.probabilytyDeerEatSheep);
        deerPrey.put(Hog.class, Settings.probabilytyDeerEatHog);
        deerPrey.put(Buffalo.class, Settings.probabilytyDeerEatBuffalo);
        deerPrey.put(Duck.class, Settings.probabilytyDeerEatDuck);
        deerPrey.put(Caterpillar.class, Settings.probabilytyDeerEatCaterpillar);
        deerPrey.put(Bear.class, Settings.probabilytyDeerEatBear);
        deerPrey.put(Boa.class, Settings.probabilytyDeerEatBoa);
        deerPrey.put(Eagle.class, Settings.probabilytyDeerEatEagle);
        deerPrey.put(Fox.class, Settings.probabilytyDeerEatFox);
        deerPrey.put(Wolf.class, Settings.probabilytyDeerEatWolf);
        deerPrey.put(Plant.class, Settings.probabilytyDeerEatPlant);

        herbivorProbabilities.put(Deer.class, deerPrey);

        // Заполняем вероятности для утки
        Map<Class<? extends Creature>, Integer> duckPrey = new HashMap<>();

        duckPrey.put(Horse.class, Settings.probabilytyDuckEatHorse);
        duckPrey.put(Deer.class, Settings.probabilytyDuckEatDeer);
        duckPrey.put(Rabbit.class,Settings.probabilytyDuckEatRabbit);
        duckPrey.put(Mouse.class, Settings.probabilytyDuckEatMouse);
        duckPrey.put(Goat.class, Settings.probabilytyDuckEatGoat);
        duckPrey.put(Sheep.class, Settings.probabilytyDuckEatSheep);
        duckPrey.put(Hog.class, Settings.probabilytyDuckEatHog);
        duckPrey.put(Buffalo.class, Settings.probabilytyDuckEatBuffalo);
        duckPrey.put(Duck.class, Settings.probabilytyDuckEatDuck);
        duckPrey.put(Caterpillar.class, Settings.probabilytyDuckEatCaterpillar);
        duckPrey.put(Bear.class, Settings.probabilytyDuckEatBear);
        duckPrey.put(Boa.class, Settings.probabilytyDuckEatBoa);
        duckPrey.put(Eagle.class, Settings.probabilytyDuckEatEagle);
        duckPrey.put(Fox.class, Settings.probabilytyDuckEatFox);
        duckPrey.put(Wolf.class, Settings.probabilytyDuckEatWolf);
        duckPrey.put(Plant.class, Settings.probabilytyDuckEatPlant);


        herbivorProbabilities.put(Duck.class, duckPrey);

        // Заполняем вероятности для козы
        Map<Class<? extends Creature>, Integer> goatPrey = new HashMap<>();

        goatPrey.put(Horse.class, Settings.probabilytyGoatEatHorse);
        goatPrey.put(Deer.class, Settings.probabilytyGoatEatDeer);
        goatPrey.put(Rabbit.class,Settings.probabilytyGoatEatRabbit);
        goatPrey.put(Mouse.class, Settings.probabilytyGoatEatMouse);
        goatPrey.put(Goat.class, Settings.probabilytyGoatEatGoat);
        goatPrey.put(Sheep.class, Settings.probabilytyGoatEatSheep);
        goatPrey.put(Hog.class, Settings.probabilytyGoatEatHog);
        goatPrey.put(Buffalo.class, Settings.probabilytyGoatEatBuffalo);
        goatPrey.put(Duck.class, Settings.probabilytyGoatEatDuck);
        goatPrey.put(Caterpillar.class, Settings.probabilytyGoatEatCaterpillar);
        goatPrey.put(Bear.class, Settings.probabilytyGoatEatBear);
        goatPrey.put(Boa.class, Settings.probabilytyGoatEatBoa);
        goatPrey.put(Eagle.class, Settings.probabilytyGoatEatEagle);
        goatPrey.put(Fox.class, Settings.probabilytyGoatEatFox);
        goatPrey.put(Wolf.class, Settings.probabilytyGoatEatWolf);
        goatPrey.put(Plant.class, Settings.probabilytyGoatEatPlant);

        herbivorProbabilities.put(Goat.class, goatPrey);

        // Заполняем вероятности для кабана
        Map<Class<? extends Creature>, Integer> hogPrey = new HashMap<>();

        hogPrey.put(Horse.class, Settings.probabilytyHogEatHorse);
        hogPrey.put(Deer.class, Settings.probabilytyHogEatDeer);
        hogPrey.put(Rabbit.class,Settings.probabilytyHogEatRabbit);
        hogPrey.put(Mouse.class, Settings.probabilytyHogEatMouse);
        hogPrey.put(Goat.class, Settings.probabilytyHogEatGoat);
        hogPrey.put(Sheep.class, Settings.probabilytyHogEatSheep);
        hogPrey.put(Hog.class, Settings.probabilytyHogEatHog);
        hogPrey.put(Buffalo.class, Settings.probabilytyHogEatBuffalo);
        hogPrey.put(Duck.class, Settings.probabilytyHogEatDuck);
        hogPrey.put(Caterpillar.class, Settings.probabilytyHogEatCaterpillar);
        hogPrey.put(Bear.class, Settings.probabilytyHogEatBear);
        hogPrey.put(Boa.class, Settings.probabilytyHogEatBoa);
        hogPrey.put(Eagle.class, Settings.probabilytyHogEatEagle);
        hogPrey.put(Fox.class, Settings.probabilytyHogEatFox);
        hogPrey.put(Wolf.class, Settings.probabilytyHogEatWolf);
        hogPrey.put(Plant.class, Settings.probabilytyHogEatPlant);

        herbivorProbabilities.put(Hog.class, hogPrey);

        // Заполняем вероятности для лошади
        Map<Class<? extends Creature>, Integer> horsePrey = new HashMap<>();

        horsePrey.put(Horse.class, Settings.probabilytyHorseEatHorse);
        horsePrey.put(Deer.class, Settings.probabilytyHorseEatDeer);
        horsePrey.put(Rabbit.class,Settings.probabilytyHorseEatRabbit);
        horsePrey.put(Mouse.class, Settings.probabilytyHorseEatMouse);
        horsePrey.put(Goat.class, Settings.probabilytyHorseEatGoat);
        horsePrey.put(Sheep.class, Settings.probabilytyHorseEatSheep);
        horsePrey.put(Hog.class, Settings.probabilytyHorseEatHog);
        horsePrey.put(Buffalo.class, Settings.probabilytyHorseEatBuffalo);
        horsePrey.put(Duck.class, Settings.probabilytyHorseEatDuck);
        horsePrey.put(Caterpillar.class, Settings.probabilytyHorseEatCaterpillar);
        horsePrey.put(Bear.class, Settings.probabilytyHorseEatBear);
        horsePrey.put(Boa.class, Settings.probabilytyHorseEatBoa);
        horsePrey.put(Eagle.class, Settings.probabilytyHorseEatEagle);
        horsePrey.put(Fox.class, Settings.probabilytyHorseEatFox);
        horsePrey.put(Wolf.class, Settings.probabilytyHorseEatWolf);
        horsePrey.put(Plant.class, Settings.probabilytyHorseEatPlant);

        herbivorProbabilities.put(Horse.class, horsePrey);

        // Заполняем вероятности для мыши
        Map<Class<? extends Creature>, Integer> mousePrey = new HashMap<>();

        mousePrey.put(Horse.class, Settings.probabilytyMouseEatHorse);
        mousePrey.put(Deer.class, Settings.probabilytyMouseEatDeer);
        mousePrey.put(Rabbit.class,Settings.probabilytyMouseEatRabbit);
        mousePrey.put(Mouse.class, Settings.probabilytyMouseEatMouse);
        mousePrey.put(Goat.class, Settings.probabilytyMouseEatGoat);
        mousePrey.put(Sheep.class, Settings.probabilytyMouseEatSheep);
        mousePrey.put(Hog.class, Settings.probabilytyMouseEatHog);
        mousePrey.put(Buffalo.class, Settings.probabilytyMouseEatBuffalo);
        mousePrey.put(Duck.class, Settings.probabilytyMouseEatDuck);
        mousePrey.put(Caterpillar.class, Settings.probabilytyMouseEatCaterpillar);
        mousePrey.put(Bear.class, Settings.probabilytyMouseEatBear);
        mousePrey.put(Boa.class, Settings.probabilytyMouseEatBoa);
        mousePrey.put(Eagle.class, Settings.probabilytyMouseEatEagle);
        mousePrey.put(Fox.class, Settings.probabilytyMouseEatFox);
        mousePrey.put(Wolf.class, Settings.probabilytyMouseEatWolf);
        mousePrey.put(Plant.class, Settings.probabilytyMouseEatPlant);

        herbivorProbabilities.put(Mouse.class, mousePrey);

        // Заполняем вероятности для кролика
        Map<Class<? extends Creature>, Integer> rabbitPrey = new HashMap<>();

        rabbitPrey.put(Horse.class, Settings.probabilytyRabbitEatHorse);
        rabbitPrey.put(Deer.class, Settings.probabilytyRabbitEatDeer);
        rabbitPrey.put(Rabbit.class,Settings.probabilytyRabbitEatRabbit);
        rabbitPrey.put(Mouse.class, Settings.probabilytyRabbitEatMouse);
        rabbitPrey.put(Goat.class, Settings.probabilytyRabbitEatGoat);
        rabbitPrey.put(Sheep.class, Settings.probabilytyRabbitEatSheep);
        rabbitPrey.put(Hog.class, Settings.probabilytyRabbitEatHog);
        rabbitPrey.put(Buffalo.class, Settings.probabilytyRabbitEatBuffalo);
        rabbitPrey.put(Duck.class, Settings.probabilytyRabbitEatDuck);
        rabbitPrey.put(Caterpillar.class, Settings.probabilytyRabbitEatCaterpillar);
        rabbitPrey.put(Bear.class, Settings.probabilytyRabbitEatBear);
        rabbitPrey.put(Boa.class, Settings.probabilytyRabbitEatBoa);
        rabbitPrey.put(Eagle.class, Settings.probabilytyRabbitEatEagle);
        rabbitPrey.put(Fox.class, Settings.probabilytyRabbitEatFox);
        rabbitPrey.put(Wolf.class, Settings.probabilytyRabbitEatWolf);
        rabbitPrey.put(Plant.class, Settings.probabilytyRabbitEatPlant);

        herbivorProbabilities.put(Rabbit.class, rabbitPrey);

        // Заполняем вероятности для овцы
        Map<Class<? extends Creature>, Integer> sheepPrey = new HashMap<>();

        sheepPrey.put(Horse.class, Settings.probabilytySheepEatHorse);
        sheepPrey.put(Deer.class, Settings.probabilytySheepEatDeer);
        sheepPrey.put(Rabbit.class,Settings.probabilytySheepEatRabbit);
        sheepPrey.put(Mouse.class, Settings.probabilytySheepEatMouse);
        sheepPrey.put(Goat.class, Settings.probabilytySheepEatGoat);
        sheepPrey.put(Sheep.class, Settings.probabilytySheepEatSheep);
        sheepPrey.put(Hog.class, Settings.probabilytySheepEatHog);
        sheepPrey.put(Buffalo.class, Settings.probabilytySheepEatBuffalo);
        sheepPrey.put(Duck.class, Settings.probabilytySheepEatDuck);
        sheepPrey.put(Caterpillar.class, Settings.probabilytySheepEatCaterpillar);
        sheepPrey.put(Bear.class, Settings.probabilytySheepEatBear);
        sheepPrey.put(Boa.class, Settings.probabilytySheepEatBoa);
        sheepPrey.put(Eagle.class, Settings.probabilytySheepEatEagle);
        sheepPrey.put(Fox.class, Settings.probabilytySheepEatFox);
        sheepPrey.put(Wolf.class, Settings.probabilytySheepEatWolf);
        sheepPrey.put(Plant.class, Settings.probabilytySheepEatPlant);

        herbivorProbabilities.put(Sheep.class, sheepPrey);
    }

    public static int getHerbivorProbability(Class<? extends Creature> herbivor, Class<? extends Creature> prey) {
        return herbivorProbabilities.getOrDefault(herbivor, new HashMap<>()).getOrDefault(prey, 0);
    }






}

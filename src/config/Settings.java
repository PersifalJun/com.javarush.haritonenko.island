package config;

public class Settings {

    public final static int lifeCycles = 15; //Кол-во циклов

    public int getLifeCycles() {
        return lifeCycles;
    }

    //Размер острова
    public final static int columnsCount = 100;
    public final static int rowsCount = 20;

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
    public final static int maxCaterpillarCount = 1000;
    public final static int maxBuffaloCount = 10;

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








    /* //Условия вероятности быть съеденным - в доработке
    static final int[][] eatingProbability = {
            {0, 0, 0, 0, 0, 10, 15, 60, 80, 60, 70, 15, 10, 40, 0, 0},
            {0, 0, 15, 0, 0, 0, 0, 20, 40, 0, 0, 0, 0, 10, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 70, 90, 0, 0, 0, 0, 60, 40, 0},
            {0, 80, 0, 0, 0, 40, 80, 80, 90, 70, 70, 50, 20, 10, 0, 0},
            {0, 0, 10, 0, 0, 0, 0, 90, 90, 0, 0, 0, 0, 80, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 90, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 90, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 90, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };
    */


    //Условия остановки симуляции (напр. все животные умерли , закончилось время острова) - в доработке

}

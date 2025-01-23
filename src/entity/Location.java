package entity;

import config.Settings;
import entity.creature.animal.Animal;
import entity.creature.animal.herbivor.*;
import entity.creature.animal.predator.*;
import entity.creature.plant.Plant;
import repository.HerbivorFactory;
import repository.PredatorFactory;

import java.util.List;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class Location {

    private final List<Animal> animals = new CopyOnWriteArrayList<>(); //Список для всех животных
    private final List<Plant> plants = new CopyOnWriteArrayList<>(); //Список для растений

    private final Random random = new Random();

    public Location() {

        //Остров , пока что как одна локация
        Island island = new Island(Settings.columnsCount, Settings.rowsCount);
        int lifeCycles = 15;

        //Животные на старте для 1 локации (пока что на весь остров)
        //Хищники
        Wolf[] wolves = new Wolf[Settings.maxWolfCount];
        Fox[] foxes = new Fox[Settings.maxFoxCount];
        Eagle[] eagles = new Eagle[Settings.maxEagleCount];
        Boa[] boas = new Boa[Settings.maxBoaCount];
        Bear[] bears = new Bear[Settings.maxBearCount];

        //Травоядные
        Caterpillar[] caterpillars = new Caterpillar[Settings.maxCaterpillarCount];
        Sheep[] flockOfSheep = new Sheep[Settings.maxSheepCount];
        Rabbit[] rabbits = new Rabbit[Settings.maxRabbitCount];
        Mouse[] mice = new Mouse[Settings.maxMouseCount];
        Horse[] horses = new Horse[Settings.maxHorseCount];
        Hog[] hogs = new Hog[Settings.maxHogCount];
        Goat[] goats = new Goat[Settings.maxGoatCount];
        Duck[] ducks = new Duck[Settings.maxDuckCount];
        Deer[] dears = new Deer[Settings.maxDeerCount];
        Buffalo[] buffaloes = new Buffalo[Settings.maxBuffaloCount];


        //Создание хищников
        PredatorFactory predatorFactory = new PredatorFactory(0,0);

        //Создание волков
        for (int i = 0; i < random.nextInt(Settings.maxWolfCount)+1; i++) {
            wolves[i] = (Wolf) predatorFactory.createPredator(wolves);
            animals.add(wolves[i]);
            //System.out.println(wolves[i]);

        }
        //Создание лис
        for (int i = 0; i < random.nextInt(Settings.maxFoxCount)+1; i++) {
            foxes[i] = (Fox) predatorFactory.createPredator(foxes);
            animals.add(foxes[i]);
            //System.out.println(foxes[i]);
        }
        //Создание медведей

        for (int i = 0; i < random.nextInt(Settings.maxBearCount)+1; i++) {
            bears[i] = (Bear) predatorFactory.createPredator(bears);
            animals.add(bears[i]);
            //System.out.println(bears[i]);
        }
        //Создание удавов
        for (int i = 0; i < random.nextInt(Settings.maxBoaCount)+1; i++) {
            boas[i] = (Boa) predatorFactory.createPredator(boas);
            animals.add(boas[i]);
            //System.out.println(boas[i]);

        }
        //Создание орлов
        for (int i = 0; i < random.nextInt(Settings.maxEagleCount)+1; i++) {
            eagles[i] = (Eagle) predatorFactory.createPredator(eagles);
            animals.add(eagles[i]);
            //System.out.println(eagles[i]);

        }


        //Создание травоядных животных
        HerbivorFactory herbivorFactory = new HerbivorFactory(0,0);

        //Создание овец
        for (int i = 0; i < random.nextInt(Settings.maxSheepCount)+1; i++) {
            flockOfSheep[i] = (Sheep) herbivorFactory.createHerbivor(flockOfSheep);
            animals.add(flockOfSheep[i]);
            //System.out.println(flockOfSheep[i]);

        }
        //Создание кроликов
        for (int i = 0; i < random.nextInt(Settings.maxRabbitCount)+1; i++) {
            rabbits[i] = (Rabbit) herbivorFactory.createHerbivor(rabbits);
            animals.add(rabbits[i]);
            //System.out.println(rabbits[i]);

        }
        //Создание мышей
        for (int i = 0; i < random.nextInt(Settings.maxMouseCount)+1; i++) {
            mice[i] = (Mouse) herbivorFactory.createHerbivor(mice);
            animals.add(mice[i]);
            //System.out.println(mice[i]);

        }
        //Создание лошадей
        for (int i = 0; i < random.nextInt(Settings.maxHorseCount)+1; i++) {
            horses[i] = (Horse) herbivorFactory.createHerbivor(horses);
            animals.add(horses[i]);
            //System.out.println(horses[i]);

        }
        //Создание коз
        for (int i = 0; i < random.nextInt(Settings.maxGoatCount)+1; i++) {
            goats[i] = (Goat) herbivorFactory.createHerbivor(goats);
            animals.add(goats[i]);
            //System.out.println(goats[i]);

        }
        //Создание уток
        for (int i = 0; i < random.nextInt(Settings.maxDuckCount)+1; i++) {
            ducks[i] = (Duck) herbivorFactory.createHerbivor(ducks);
            animals.add(ducks[i]);
            //System.out.println(ducks[i]);

        }
        //Создание оленей
        for (int i = 0; i < random.nextInt(Settings.maxDeerCount)+1; i++) {
            dears[i] = (Deer) herbivorFactory.createHerbivor(dears);
            animals.add(dears[i]);
            //System.out.println(dears[i]);

        }
        //Создание гусениц
        for (int i = 0; i < random.nextInt(Settings.maxCaterpillarCount)+1; i++) {
            caterpillars[i] = (Caterpillar) herbivorFactory.createHerbivor(caterpillars);
            animals.add(caterpillars[i]);
            //System.out.println(caterpillars[i]);

        }
        //Создание буйвалов
        for (int i = 0; i < random.nextInt(Settings.maxBuffaloCount)+1; i++) {
            buffaloes[i] = (Buffalo) herbivorFactory.createHerbivor(buffaloes);
            animals.add(buffaloes[i]);
            //System.out.println(buffaloes[i]);

        }

        for (int i = 0; i < Settings.maxPlantCount; i++) {
            plants.add(new Plant());
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }
    public List<Plant> getPlants(){
        return plants;
    }


    public void removePlant(Plant plant) {
        plants.remove(plant);
    }

    public void removeAnimal(Animal animal) {
        synchronized (animals) {
            animals.remove(animal);
        }
    }



    public void AnimalAndPlantLifeCycle(){
        for (int i = 0; i < animals.size(); i++) {
            for(int j = 0; i< animals.size();i++){
                animals.get(i).decreaseSatiety();
                if (animals.get(i) instanceof Predator && animals.get(j) instanceof Herbivor){
                    Predator predator = (Predator) animals.get(i);
                    predator.eat(animals.get(j));
                    animals.get(i).die(animals.get(j));

                }
                else if (animals.get(i) instanceof Herbivor && animals.get(j) instanceof Predator){
                    Predator predator = (Predator) animals.get(j);
                    predator.eat(animals.get(i));
                    animals.get(i).die(animals.get(j));

                }

            }

            animals.get(i).reproduce();

            if (!animals.get(i).isAlive()) {
                animals.remove(animals.get(i));
            }
        }
        int grass= random.nextInt(10);
        for (int i = 0; i < grass; i++) {
            plants.add(new Plant());
        }

        System.out.println("Всего растений : " + grass);
    }



    public void printStatistics() {
        long wolvesCount = animals.stream().filter(p -> p instanceof Wolf).count();
        long boasCount = animals.stream().filter(p -> p instanceof Boa).count();
        long foxesCount = animals.stream().filter(p -> p instanceof Fox).count();
        long bearsCount = animals.stream().filter(p -> p instanceof Bear).count();
        long eaglesCount = animals.stream().filter(p -> p instanceof Eagle).count();
        long horsesCount = animals.stream().filter(p -> p instanceof Horse).count();
        long deersCount = animals.stream().filter(p -> p instanceof Deer).count();
        long rabbitsCount = animals.stream().filter(p -> p instanceof Rabbit).count();
        long miceCount = animals.stream().filter(p -> p instanceof Mouse).count();
        long goatsCount = animals.stream().filter(p -> p instanceof Goat).count();
        long sheepsCount = animals.stream().filter(p -> p instanceof Sheep).count();
        long boarsCount = animals.stream().filter(p -> p instanceof Bear).count();
        long buffalosCount = animals.stream().filter(p -> p instanceof Buffalo).count();
        long ducksCount = animals.stream().filter(p -> p instanceof Duck).count();
        long caterpillarsCount = animals.stream().filter(p -> p instanceof Caterpillar).count();
        long plantsCount = plants.size();



        System.out.println("Статистика:");
        System.out.println("-".repeat(100));
        System.out.println("Animals:" + animals.size());
        System.out.println("Хищные звери");
        System.out.println();
        System.out.println("Wolves: " + wolvesCount);
        System.out.println("Boas: " + boasCount);
        System.out.println("Foxes: " + foxesCount);
        System.out.println("Bears: " + bearsCount);
        System.out.println("Eagles: " + eaglesCount);
        System.out.println();
        System.out.println("Травоядные звери");
        System.out.println();
        System.out.println("Horses: " + horsesCount);
        System.out.println("Deers: " + deersCount);
        System.out.println("Rabbits: " + rabbitsCount);
        System.out.println("Mice: " + miceCount);
        System.out.println("Goats: " + goatsCount);
        System.out.println("Sheeps: " + sheepsCount);
        System.out.println("Boars: " + boarsCount);
        System.out.println("Buffalos: " + buffalosCount);
        System.out.println("Ducks: " + ducksCount);
        System.out.println("Caterpillars: " + caterpillarsCount);
        System.out.println("Plants: " + plantsCount);

        System.out.println("-".repeat(100));
    }



}





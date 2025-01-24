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
import java.util.concurrent.ThreadLocalRandom;

public class Location implements Runnable {

    private final List<Animal> animals = new CopyOnWriteArrayList<>(); //Список для всех животных
    private final List<Plant> plants = new CopyOnWriteArrayList<>(); //Список для растений
    private ThreadLocalRandom localRandom = ThreadLocalRandom.current();
    private final Random random = new Random();
    public int lifeCycles = 20; //Кол-во циклов

    public Location() {

        //Остров , пока что как одна локация
        Island island = new Island(Settings.columnsCount, Settings.rowsCount);


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

        for (int i = 0; i < random.nextInt(Settings.maxPlantCount)+1; i++) {
            plants.add(new Plant(localRandom.nextDouble(1)+1));
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

    synchronized public void growPlants(){

        for (int i = 0; i < localRandom.nextInt(plants.size())+1; i++) {
            getPlants().add(new Plant(localRandom.nextDouble(1)+1));
        }

    }

    synchronized public void animalAndPlantLifeCycle(){
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).decreaseSatiety();
            for(int j = 0; i< animals.size();i++){
                if (animals.get(i) instanceof Predator && animals.get(j) instanceof Herbivor){
                    Predator predator = (Predator) animals.get(i);
                    Herbivor herbivor = (Herbivor) animals.get(j);
                    predator.eat(herbivor);
                    predator.die(herbivor);

                }
                else if (animals.get(i) instanceof Herbivor && animals.get(j) instanceof Predator){
                    Herbivor herbivor = (Herbivor) animals.get(i);
                    Predator predator = (Predator) animals.get(j);
                    predator.eat(herbivor);
                    predator.die(herbivor);

                }

            }

            animals.get(i).reproduce();

            if (!animals.get(i).isAlive()) {
                animals.remove(animals.get(i));
            }
        }


        System.out.println("Всего растений : " + getPlants());
    }

    @Override
    public void run() {
        growPlants();
        animalAndPlantLifeCycle();

    }
}









package entity;

import config.Settings;
import entity.creature.animal.Animal;
import entity.creature.animal.herbivor.*;
import entity.creature.animal.predator.*;
import entity.creature.plant.Plant;
import repository.HerbivorFactory;
import repository.PredatorFactory;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.Random;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Location implements Runnable {

    private final List<Animal> animals = new CopyOnWriteArrayList<>(); //Список для всех животных
    private final List<Plant> plants = new CopyOnWriteArrayList<>(); //Список для растений
    private final ThreadLocalRandom localRandom = ThreadLocalRandom.current();
    private final Random random = new Random();
    static Settings settings = new Settings();
    public static int lifeCycles = settings.getLifeCycles();


    public Location() {

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
        PredatorFactory predatorFactory = new PredatorFactory(0, 0);

        //Создание волков
        for (int i = 0; i < random.nextInt(Settings.maxWolfCount) + 1; i++) {
            wolves[i] = (Wolf) predatorFactory.createPredator(wolves);
            animals.add(wolves[i]);
            //System.out.println(wolves[i]);

        }
        //Создание лис
        for (int i = 0; i < random.nextInt(Settings.maxFoxCount) + 1; i++) {
            foxes[i] = (Fox) predatorFactory.createPredator(foxes);
            animals.add(foxes[i]);
            //System.out.println(foxes[i]);
        }

        //Создание медведей
        for (int i = 0; i < random.nextInt(Settings.maxBearCount) + 1; i++) {
            bears[i] = (Bear) predatorFactory.createPredator(bears);
            animals.add(bears[i]);
            //System.out.println(bears[i]);
        }
        //Создание удавов
        for (int i = 0; i < random.nextInt(Settings.maxBoaCount) + 1; i++) {
            boas[i] = (Boa) predatorFactory.createPredator(boas);
            animals.add(boas[i]);
            //System.out.println(boas[i]);

        }
        //Создание орлов
        for (int i = 0; i < random.nextInt(Settings.maxEagleCount) + 1; i++) {
            eagles[i] = (Eagle) predatorFactory.createPredator(eagles);
            animals.add(eagles[i]);
            //System.out.println(eagles[i]);

        }


        //Создание травоядных животных
        HerbivorFactory herbivorFactory = new HerbivorFactory(0, 0);

        //Создание овец
        for (int i = 0; i < random.nextInt(Settings.maxSheepCount) + 1; i++) {
            flockOfSheep[i] = (Sheep) herbivorFactory.createHerbivor(flockOfSheep);
            animals.add(flockOfSheep[i]);
            //System.out.println(flockOfSheep[i]);

        }
        //Создание кроликов
        for (int i = 0; i < random.nextInt(Settings.maxRabbitCount) + 1; i++) {
            rabbits[i] = (Rabbit) herbivorFactory.createHerbivor(rabbits);
            animals.add(rabbits[i]);
            //System.out.println(rabbits[i]);

        }
        //Создание мышей
        for (int i = 0; i < random.nextInt(Settings.maxMouseCount) + 1; i++) {
            mice[i] = (Mouse) herbivorFactory.createHerbivor(mice);
            animals.add(mice[i]);
            //System.out.println(mice[i]);

        }
        //Создание лошадей
        for (int i = 0; i < random.nextInt(Settings.maxHorseCount) + 1; i++) {
            horses[i] = (Horse) herbivorFactory.createHerbivor(horses);
            animals.add(horses[i]);
            //System.out.println(horses[i]);

        }
        //Создание кабанов
        for (int i = 0; i < random.nextInt(Settings.maxHogCount) + 1; i++) {
            hogs[i] = (Hog) herbivorFactory.createHerbivor(hogs);
            animals.add(hogs[i]);
            //System.out.println(hogs[i]);
        }
        //Создание коз
        for (int i = 0; i < random.nextInt(Settings.maxGoatCount) + 1; i++) {
            goats[i] = (Goat) herbivorFactory.createHerbivor(goats);
            animals.add(goats[i]);
            //System.out.println(goats[i]);

        }
        //Создание уток
        for (int i = 0; i < random.nextInt(Settings.maxDuckCount) + 1; i++) {
            ducks[i] = (Duck) herbivorFactory.createHerbivor(ducks);
            animals.add(ducks[i]);
            //System.out.println(ducks[i]);

        }
        //Создание оленей
        for (int i = 0; i < random.nextInt(Settings.maxDeerCount) + 1; i++) {
            dears[i] = (Deer) herbivorFactory.createHerbivor(dears);
            animals.add(dears[i]);
            //System.out.println(dears[i]);

        }
        //Создание гусениц
        for (int i = 0; i < random.nextInt(Settings.maxCaterpillarCount) + 1; i++) {
            caterpillars[i] = (Caterpillar) herbivorFactory.createHerbivor(caterpillars);
            animals.add(caterpillars[i]);
            //System.out.println(caterpillars[i]);

        }
        //Создание буйвалов
        for (int i = 0; i < random.nextInt(Settings.maxBuffaloCount) + 1; i++) {
            buffaloes[i] = (Buffalo) herbivorFactory.createHerbivor(buffaloes);
            animals.add(buffaloes[i]);
            //System.out.println(buffaloes[i]);

        }



    }

    public List<Animal> getAnimals() {

        return animals;
    }

    public List<Plant> getPlants() {

        return plants;
    }


    public void growPlants() {
        for (int i = 0; i < localRandom.nextInt(Settings.maxPlantCount) + 1; i++) {
            plants.add(new Plant(localRandom.nextDouble(1) + 1));
        }
        System.out.println("Выросли растения: " + getPlants().size());
    }



    //Спавн животных :
    synchronized public void animalsSpawn(){

        System.out.println("Произошел спавн животных");
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println("Животное: " + animal.getClass().getSimpleName() +
                    " | Вес: " + animal.getCurrentWeight() +
                    " | Сытость: " + animal.getCurrentSatiety());

        }
    }

    synchronized public void lostSatiety(){
        // Понижение сытости и веса за 1 жизненный цикл
        Iterator<Animal> iterator = animals.iterator();
        System.out.println("Произошла потеря сытости");
        while (iterator.hasNext()) {
            Animal beast = iterator.next();
            beast.decreaseSatiety();
            if (beast.getCurrentSatiety() <= 0 && beast.getCurrentWeight() < beast.getMaxWeight() / 2) {
                System.out.println(beast.getClass().getSimpleName() + " погиб от истощения.");
                iterator.remove();                          //Удаление данного объекта
            }
            else {
                System.out.println("Животное: " + beast.getClass().getSimpleName() +
                        " | Текущий вес: " + beast.getCurrentWeight() +
                        " | Текущая сытость: " + beast.getCurrentSatiety());
            }
        }
    }

    synchronized public void predatorHunting() {
        List<Animal> predatorsToRemove = new ArrayList<>();
        List<Animal> preyToRemove = new ArrayList<>();

        for (Animal predator : new ArrayList<>(animals)) { // Используем копию списка
            if (predator instanceof Predator) {
                for (Animal prey : new ArrayList<>(animals)) {
                    if (prey instanceof Herbivor) {
                        int probability = Predator.getProbability(predator.getClass(), prey.getClass());
                        System.out.println(predator.getClass().getSimpleName() + " пытается съесть " + prey.getClass().getSimpleName() +
                                " (вероятность " + probability + "%)");

                        if (localRandom.nextInt(100) < probability) { // Проверяем вероятность охоты
                            predator.eat(prey); // Хищник ест жертву
                            System.out.println(predator.getClass().getSimpleName() + " съел " +
                                    prey.getClass().getSimpleName() +
                                    "; satiety: " +  predator.getCurrentSatiety() +
                                    "; weight: " + predator.getCurrentWeight());

                            preyToRemove.add(prey); // Отмечаем жертву для удаления
                        }
                    }
                }

                // Если хищник переел — сразу убираем его из цикла
                if (((Predator) predator).isOverfed()) {
                    System.out.println(predator.getClass().getSimpleName() + " умер от переедания!");
                    predatorsToRemove.add(predator);
                    continue; // Пропускаем дальнейшую охоту для умершего хищника
                }
            }
        }

        // Удаляем животных после цикла
        animals.removeAll(preyToRemove);
        animals.removeAll(predatorsToRemove);
    }



    synchronized public void herbivorsEating(){                     // Травоядные едят растения (вероятность 100%)

        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal herbivore = iterator.next();
            if (herbivore instanceof Herbivor && !getPlants().isEmpty()) {
                Plant plant = getPlants().remove(getPlants().size() - 1);
                (herbivore).eat(plant);
                System.out.println(herbivore.getClass().getSimpleName() + " съел растение." + " Осталось растений на локации: "+ getPlants().size());
            }
        }
    }

    synchronized public void animalReproduce(){
        List<Animal> newAnimals = new ArrayList<>();

        // Размножение животных (вероятность 25%) - пока что убрал
        for (int i = 0; i < animals.size(); i++) {
            for (int j = i + 1; j < animals.size(); j++) {
                if (animals.get(i).getClass().equals(animals.get(j).getClass())) {
                    Animal parent1 = animals.get(i);
                    Animal child = parent1.reproduce();
                    if (child != null && animals.size() < 10) {
                        newAnimals.add(child);
                        System.out.println("Родился новый " + child.getClass().getSimpleName());
                    }
                }
            }
        }

        animals.addAll(newAnimals);


    }




    public void animalAndPlantLifeCycle() {

        growPlants();
        animalsSpawn();
        herbivorsEating();
        lostSatiety();
        predatorHunting();
        //animalReproduce();
        System.out.println();
        System.out.println("-".repeat(100));

    }

    @Override
    public void run() {

        animalAndPlantLifeCycle();

    }
}
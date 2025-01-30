package entity;

import config.Settings;

import entity.creature.animal.Animal;
import entity.creature.animal.herbivor.*;
import entity.creature.animal.predator.*;
import entity.creature.plant.Plant;
import repository.HerbivorFactory;
import repository.PredatorFactory;
import util.Statistics;


import java.util.*;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantLock;

public class Location implements Runnable {

    private final List<Animal> animals = new CopyOnWriteArrayList<>(); //Список для всех животных
    private final List<Plant> plants = new CopyOnWriteArrayList<>(); //Список для растений
    private final ThreadLocalRandom localRandom = ThreadLocalRandom.current();
    private final Random random = new Random();
    static Settings settings = new Settings();
    public static int lifeCycles = settings.getLifeCycles();
    Statistics statistics = new Statistics();
    private ReentrantLock lock = new ReentrantLock(); // Блокировка для потокобезопасности
    private int capacity; // Вместимость локации
    private int x, y; // Координаты локации

    public Location(int x,int y) {
        this.x=x;
        this.y=y;

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
            wolves[i] = (Wolf) predatorFactory.createPredator(Wolf.class);
            animals.add(wolves[i]);


        }
        //Создание лис
        for (int i = 0; i < random.nextInt(Settings.maxFoxCount) + 1; i++) {
            foxes[i] = (Fox) predatorFactory.createPredator(Fox.class);
            animals.add(foxes[i]);

        }

        //Создание медведей
        for (int i = 0; i < random.nextInt(Settings.maxBearCount) + 1; i++) {
            bears[i] = (Bear) predatorFactory.createPredator(Bear.class);
            animals.add(bears[i]);

        }
        //Создание удавов
        for (int i = 0; i < random.nextInt(Settings.maxBoaCount) + 1; i++) {
            boas[i] = (Boa) predatorFactory.createPredator(Boa.class);
            animals.add(boas[i]);


        }
        //Создание орлов
        for (int i = 0; i < random.nextInt(Settings.maxEagleCount) + 1; i++) {
            eagles[i] = (Eagle) predatorFactory.createPredator(Eagle.class);
            animals.add(eagles[i]);


        }


        //Создание травоядных животных
        HerbivorFactory herbivorFactory = new HerbivorFactory(0, 0);

        //Создание овец
        for (int i = 0; i < random.nextInt(Settings.maxSheepCount) + 1; i++) {
            flockOfSheep[i] = (Sheep) herbivorFactory.createHerbivor(Sheep.class);
            animals.add(flockOfSheep[i]);


        }
        //Создание кроликов
        for (int i = 0; i < random.nextInt(Settings.maxRabbitCount) + 1; i++) {
            rabbits[i] = (Rabbit) herbivorFactory.createHerbivor(Rabbit.class);
            animals.add(rabbits[i]);


        }
        //Создание мышей
        for (int i = 0; i < random.nextInt(Settings.maxMouseCount) + 1; i++) {
            mice[i] = (Mouse) herbivorFactory.createHerbivor(Mouse.class);
            animals.add(mice[i]);


        }
        //Создание лошадей
        for (int i = 0; i < random.nextInt(Settings.maxHorseCount) + 1; i++) {
            horses[i] = (Horse) herbivorFactory.createHerbivor(Horse.class);
            animals.add(horses[i]);


        }
        //Создание кабанов
        for (int i = 0; i < random.nextInt(Settings.maxHogCount) + 1; i++) {
            hogs[i] = (Hog) herbivorFactory.createHerbivor(Hog.class);
            animals.add(hogs[i]);

        }
        //Создание коз
        for (int i = 0; i < random.nextInt(Settings.maxGoatCount) + 1; i++) {
            goats[i] = (Goat) herbivorFactory.createHerbivor(Goat.class);
            animals.add(goats[i]);


        }
        //Создание уток
        for (int i = 0; i < random.nextInt(Settings.maxDuckCount) + 1; i++) {
            ducks[i] = (Duck) herbivorFactory.createHerbivor(Duck.class);
            animals.add(ducks[i]);


        }
        //Создание оленей
        for (int i = 0; i < random.nextInt(Settings.maxDeerCount) + 1; i++) {
            dears[i] = (Deer) herbivorFactory.createHerbivor(Deer.class);
            animals.add(dears[i]);


        }
        //Создание гусениц
        for (int i = 0; i < random.nextInt(Settings.maxCaterpillarCount) + 1; i++) {
            caterpillars[i] = (Caterpillar) herbivorFactory.createHerbivor(Caterpillar.class);
            animals.add(caterpillars[i]);


        }
        //Создание буйвалов
        for (int i = 0; i < random.nextInt(Settings.maxBuffaloCount) + 1; i++) {
            buffaloes[i] = (Buffalo) herbivorFactory.createHerbivor(Buffalo.class);
            animals.add(buffaloes[i]);

        }



    }

    // Метод для добавления животного
    public void addAnimal(Animal clonedAnimal) {
        lock.lock(); // Блокируем ресурсы для синхронизации
        try {
            if (animals.size() < capacity) {
                animals.add(clonedAnimal); // Добавляем животное
                clonedAnimal.setLocation(this); // Устанавливаем локацию для животного
                System.out.println(clonedAnimal.getSpecies() + " добавлено в локацию [" + x + ", " + y + "]");
            } else {
                System.out.println("Локация [" + x + ", " + y + "] переполнена. Не удается добавить животное.");
            }
        } finally {
            lock.unlock(); // Разблокируем ресурсы
        }
    }

    // Метод для удаления животного
    public void removeAnimal(Animal animal) {
        lock.lock(); // Блокируем ресурсы для синхронизации
        try {
            if (animals.remove(animal)) { // Удаляем животное
                System.out.println(animal.getSpecies() + " удалено из локации [" + x + ", " + y + "]");
            } else {
                System.out.println(animal.getSpecies() + " не найдено в локации [" + x + ", " + y + "]");
            }
        } finally {
            lock.unlock(); // Разблокируем ресурсы
        }
    }
    // Метод для получения вместимости
    public int getCapacity() {
        return capacity;
    }

    // Метод для получения максимального количества животных одного вида
    public int getMaxSpeciesCount(String species) {
        // Примерное количество животных одного вида на локации
        return 5; // Можно менять в зависимости от вида и типа локации
    }

    // Метод для получения соседней локации
    public Location getAdjacentLocation(int dx, int dy) {
        // Например, просто создаем новую локацию с изменением координат
        return new Location(this.x + dx, this.y + dy);
    }

    // Дополнительные методы
    public String getCoordinates() {
        return "[" + x + ", " + y + "]";
    }

    public List<Animal> getAnimals() {

        return animals;
    }

    public List<Plant> getPlants() {

        return plants;
    }


    // Выращивание растений с ограничением на максимальное количество
    public void growPlants() {
        // Ограничение на количество растений
        int currentPlantCount = plants.size();
        int maxPlants = Settings.maxPlantCount;

        // Добавляем растения, если текущее количество меньше максимума
        if (currentPlantCount < maxPlants) {
            for (int i = 0; i < Math.min(localRandom.nextInt(Settings.maxPlantCount) + 1, maxPlants - currentPlantCount); i++) {
                plants.add(new Plant(localRandom.nextDouble(1) + 1));
            }
            System.out.println("Выросли растения: " + getPlants().size());
        } else {
            System.out.println("Достигнут лимит растений на локации.");
        }
    }



    // Спавн животных с ограничением на максимальное количество
    synchronized public void animalsSpawn() {
        System.out.println("Произошел спавн животных");

        // Ограничение на количество животных
        int currentAnimalCount = animals.size();


        // Если текущее количество животных меньше максимума, продолжаем добавлять
        if (currentAnimalCount < Settings.maxCountAnimals) {
            Iterator<Animal> iterator = animals.iterator();
            while (iterator.hasNext()) {
                Animal animal = iterator.next();
                System.out.println("Животное: " + animal.getClass().getSimpleName() +
                        " | Вес: " + animal.getCurrentWeight() +
                        " | Сытость: " + animal.getCurrentSatiety());
            }
        } else {
            System.out.println("Достигнут лимит животных на локации.");
        }
    }

    synchronized public void lostSatiety() {
        Iterator<Animal> iterator = animals.iterator();
        List<Animal> animalsToRemove = new ArrayList<>();

        System.out.println("Произошла потеря сытости");

        while (iterator.hasNext()) {
            Animal beast = iterator.next();
            if(!(beast  instanceof Caterpillar)){
                beast.decreaseSatiety(); // Уменьшаем сытость и вес
            }


            // Условие смерти от голода
            if ((beast.getCurrentSatiety() <= 0 || beast.getCurrentWeight() < beast.getMaxWeight() * 0.5)&& !(beast  instanceof Caterpillar)){
                System.out.println(beast.getClass().getSimpleName() + " погиб от истощения.");
                animalsToRemove.add(beast); // Добавляем в список на удаление
            } else {
                if(!(beast  instanceof Caterpillar)) {
                    System.out.println("Животное: " + beast.getClass().getSimpleName() +
                            " | Текущий вес: " + beast.getCurrentWeight() +
                            " | Текущая сытость: " + beast.getCurrentSatiety());
                }
            }
        }

        // Удаляем голодных животных после итерации
        animals.removeAll(animalsToRemove);


    }

    synchronized public void predatorHunting() {
        List<Animal> predatorsToRemove = new ArrayList<>();
        List<Animal> preyToRemove = new ArrayList<>();
        System.out.println("Началась охота!");

        for (Animal predator : new ArrayList<>(animals)) { // Используем копию списка
            if (predator instanceof Predator) {
                // Если хищник уже переел — он не охотится и сразу умирает
                if (((Predator) predator).isOverfed()) {
                    System.out.println(predator.getClass().getSimpleName() + " " + predator.die() + " от переедания!");
                    predatorsToRemove.add(predator);
                    continue; // Охотится следующее животное
                }

                // Генерация случайного числа от 1 до 5 для попыток охоты
                int huntingAttempts = localRandom.nextInt(5) + 1; // от 1 до 5 попыток

                int attemptCount = 0;

                for (int i = 0; i < huntingAttempts; i++) { // Хищник пытается съесть несколько раз
                    boolean hunted = false;

                    // Охота на травоядных
                    for (Animal prey : new ArrayList<>(animals)) {
                        if (prey instanceof Herbivor) {
                            int probability = Settings.getPredatorProbability(predator.getClass(), prey.getClass());
                            if (probability != 0) {
                                System.out.println(predator.getClass().getSimpleName() + " пытается съесть " + prey.getClass().getSimpleName() +
                                        " (вероятность " + probability + "%)");
                            }

                            if (localRandom.nextInt(100) < probability && !((Predator) predator).isOverfed()) { // Проверяем вероятность охоты
                                predator.eat(prey); // Хищник ест жертву

                                // Если хищник переел после еды, он умирает сразу
                                if (((Predator) predator).isOverfed()) {
                                    System.out.println(predator.getClass().getSimpleName() + " переел и умер!");
                                    predatorsToRemove.add(predator);
                                    break; // Выходим из цикла охоты для этого хищника
                                }

                                preyToRemove.add(prey); // Отмечаем жертву для удаления
                                hunted = true;
                                break; // Если хищник съел, выходим из охоты
                            }
                        }
                    }

                    if (hunted) {
                        attemptCount++;
                    }

                    // Если хищник съел за все попытки, выходим из цикла
                    if (attemptCount >= huntingAttempts) {
                        break;
                    }
                }
            }
        }

        // Удаляем животных после цикла
        animals.removeAll(preyToRemove);
        animals.removeAll(predatorsToRemove);
    }



    synchronized public void herbivorsEating() {
        List<Animal> toRemove = new ArrayList<>(); // Список животных, которых нужно удалить

        for (Animal herbivore : new ArrayList<>(animals)) { // Создаём копию списка
            if (herbivore instanceof Herbivor) {
                boolean ateSomething = false;

                // Если травоядное не голодное, пропускаем его
                if (herbivore.getCurrentSatiety() >= herbivore.getFullSatiety()) {
                    continue; // Животное сытое, оно не будет есть
                }

                // Генерируем случайное количество попыток поедания (от 1 до 5)
                int maxEatingAttempts = 5;
                int attempts = new Random().nextInt(maxEatingAttempts) + 1; // Количество попыток от 1 до 5

                int attemptCount = 0;

                // Сначала животное ест растения (рандомное количество попыток)
                while (!getPlants().isEmpty() && herbivore.getCurrentSatiety() < herbivore.getFullSatiety() && attemptCount < attempts) {
                    Plant plant = getPlants().remove(getPlants().size() - 1);
                    herbivore.eat(plant);
                    attemptCount++;
                    System.out.println(herbivore.getClass().getSimpleName() + " съел растение." + " Текущий вес: " +
                            herbivore.getCurrentWeight() + " Текущая сытость: " + herbivore.getCurrentSatiety() +
                            ". Осталось растений: " + getPlants().size());
                    ateSomething = true;
                }

                // Если травоядное всё ещё не сытое, оно пытается съесть другого травоядного (рандомное количество попыток)
                if (herbivore.getCurrentSatiety() < herbivore.getFullSatiety() && attemptCount < attempts) {
                    int herbivoreAttempts = localRandom.nextInt(maxEatingAttempts) + 1; // Генерируем случайное количество попыток поедания других травоядных

                    for (int i = 0; i < herbivoreAttempts; i++) { // Попытки поедания других травоядных
                        for (Animal prey : new ArrayList<>(animals)) { // Создаём копию списка животных
                            if (prey != herbivore && prey instanceof Herbivor) {
                                int probability = Settings.getHerbivorProbability(herbivore.getClass(), prey.getClass());
                                int chance = localRandom.nextInt(100) + 1; // Генерация числа от 1 до 100

                                if (chance <= probability) {
                                    herbivore.eat(prey); // Поедание другого травоядного
                                    toRemove.add(prey); // Добавляем жертву в список на удаление
                                    System.out.println(herbivore.getClass().getSimpleName() + " съел " + prey.getClass().getSimpleName() +
                                            " Текущий вес: " + herbivore.getCurrentWeight() + " Текущая сытость: " + herbivore.getCurrentSatiety());
                                    break; // После удачного поедания прекращаем попытки съесть других травоядных
                                }
                            }
                        }
                    }
                }

                // Проверка на переедание (если сытость больше, чем на 10% превышена)
                if (herbivore.getCurrentSatiety() > herbivore.getFullSatiety() * 1.1) { // 10% превышение
                    System.out.println(herbivore.getClass().getSimpleName() + " переел и умер!");
                    toRemove.add(herbivore); // Добавляем травоядное в список на удаление
                }
            }
        }

        // Удаляем всех животных, которые были съедены или умерли
        animals.removeAll(toRemove);
    }


    synchronized public void animalReproduce() {
        List<Animal> newAnimals = new ArrayList<>(); // Список для новых животных
        Set<Animal> alreadyReproduced = new HashSet<>(); // Множество уже размножившихся животных

        // Храним количество животных каждого типа
        Map<Class<? extends Animal>, Integer> animalCounts = new HashMap<>();
        System.out.println("Размножение");

        for (Animal animal : animals) {
            animalCounts.put(animal.getClass(), animalCounts.getOrDefault(animal.getClass(), 0) + 1);
        }

        // Проходим по каждому животному и пытаемся найти пару для размножения
        for (int i = 0; i < animals.size(); i++) {
            for (int j = i + 1; j < animals.size(); j++) {
                Animal parent1 = animals.get(i);
                Animal parent2 = animals.get(j);

                // Если животные уже размножались, пропускаем их
                if (alreadyReproduced.contains(parent1) || alreadyReproduced.contains(parent2)) {
                    continue;
                }

                // Проверяем, что оба животного одного типа
                if (parent1.getClass().equals(parent2.getClass())) {
                    int maxCount = Settings.getMaxCount(parent1.getClass()); // Максимальное количество для данного типа
                    int currentCount = animalCounts.get(parent1.getClass()); // Текущее количество животных данного типа

                    // Если текущее количество животных меньше максимального, проверяем шанс на размножение
                    if (currentCount < maxCount) {
                        if (Math.random() < 0.25) { // Шанс на размножение 25%
                            Animal child = null;

                            // Размножение в зависимости от типа животного
                            if (parent1 instanceof Predator) {
                                child = ((Predator) parent1).reproduce();
                            } else if (parent1 instanceof Herbivor) {
                                child = ((Herbivor) parent1).reproduce();
                            }

                            // Если детеныш появился, проверяем, что лимит для этого типа еще не достигнут
                            if (child != null) {
                                int childCount = animalCounts.getOrDefault(child.getClass(), 0);

                                // Проверяем лимит для потомков
                                if (childCount < Settings.getMaxCount(child.getClass())) {
                                    newAnimals.add(child); // Добавляем детеныша в список
                                    animalCounts.put(child.getClass(), childCount + 1); // Увеличиваем количество животных этого типа
                                    alreadyReproduced.add(parent1); // Помечаем родителей как размножившихся
                                    alreadyReproduced.add(parent2);
                                    System.out.println("Родился новый " + child.getClass().getSimpleName() +
                                            " | Вес: " + child.getCurrentWeight() +
                                            " | Сытость: " + child.getCurrentSatiety());
                                }
                            }
                        }
                    }
                }
            }
        }

        // Добавляем всех новых животных в основной список
        animals.addAll(newAnimals);

        // Логируем завершение размножения
        System.out.println("Общее количество животных после размножения: ");
        for (Map.Entry<Class<? extends Animal>, Integer> entry : animalCounts.entrySet()) {
            System.out.println(entry.getKey().getSimpleName() + ": " + entry.getValue());
        }
    }

    public void animalsMove() {
        lock.lock(); // Блокируем ресурсы для синхронизации
        try {
            System.out.println("Перемещение животных на локации [" + this.getCoordinates() + "]...");
            // Перемещаем каждого животного на локации
            for (Animal animal : animals) {
                if (animal.isAlive()) {
                    System.out.println("Животное с видом " + animal.getSpecies() + " на локации [" + this.getCoordinates() + "] перемещается...");
                    animal.move(); // Вызываем move для каждого животного
                }
            }
        } finally {
            lock.unlock(); // Разблокируем ресурсы
        }
    }






    public void animalAndPlantLifeCycle() {

        growPlants();
        System.out.println();
        animalsSpawn();
        System.out.println("Всего животных: "+ getAnimals().size());
        System.out.println();
        herbivorsEating();
        System.out.println();
        lostSatiety();
        System.out.println();

        predatorHunting();
        System.out.println();
        animalReproduce();
        System.out.println();
        animalsMove();
        System.out.println("Осталось растений: " + getPlants().size());
        System.out.println("Осталось животных: " + getAnimals().size());
        System.out.println("Прошел день жизни");


        // Вывод статистики
        statistics.printStatistics();

        System.out.println();
        System.out.println("-".repeat(100));
        System.out.println();
        System.out.println("-".repeat(100));

    }

    @Override
    public void run() {

        animalAndPlantLifeCycle();

    }


}
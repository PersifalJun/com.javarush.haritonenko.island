package entity.creature.animal.herbivor;


import config.Settings;
import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.plant.Plant;
import repository.HerbivorFactory;

import java.util.List;


public class Herbivor extends Animal {



    public Herbivor(double currentWeight, double currentSatiety) {

        super(currentWeight, currentSatiety);
    }
    @Override
    public double getMaxWeight() {
        if (this instanceof Buffalo) return Settings.maxBuffaloWeight;
        if (this instanceof Caterpillar) return Settings.maxCaterpillarWeight;
        if (this instanceof Deer) return Settings.maxDeerWeight;
        if (this instanceof Duck) return Settings.maxDuckWeight;
        if (this instanceof Goat) return Settings.maxGoatWeight;
        if (this instanceof Hog) return Settings.maxHogWeight;
        if (this instanceof Horse) return Settings.maxHorseWeight;
        if (this instanceof Mouse) return Settings.maxMouseWeight;
        if (this instanceof Rabbit) return Settings.maxRabbitWeight;
        if (this instanceof Sheep) return Settings.maxSheepWeight;
        return 0;
    }
    @Override
    public double getFullSatiety() {
        if (this instanceof Buffalo) return Settings.BuffaloFullSatiety;
        if (this instanceof Caterpillar) return Settings.CaterpillarFullSatiety;
        if (this instanceof Deer) return Settings.DeerFullSatiety;
        if (this instanceof Duck) return Settings.DuckFullSatiety;
        if (this instanceof Goat) return Settings.GoatFullSatiety;
        if (this instanceof Hog) return Settings.HogFullSatiety;
        if (this instanceof Horse) return Settings.HorseFullSatiety;
        if (this instanceof Mouse) return Settings.MouseFullSatiety;
        if (this instanceof Rabbit) return Settings.RabbitFullSatiety;
        if (this instanceof Sheep) return Settings.SheepFullSatiety;
        return 0;
    }


    @Override
    public synchronized void eat(Creature food) {
        lock.lock();
        try {
            if (food instanceof Plant) {
                double foodWeight = ((Plant) food).weight;

                // Для травоядных увеличение сытости и веса происходит медленнее
                if (this instanceof Rabbit || this instanceof Mouse) {
                    // Для зайцев и мышей  коэффициенты меньше
                    this.currentSatiety += foodWeight * 0.005;
                    this.currentWeight += foodWeight * 0.005;
                } else {
                    // Для более крупных травоядных
                    this.currentSatiety += foodWeight * 0.01;
                    this.currentWeight += foodWeight * 0.01;
                }

            } else if (food instanceof Herbivor) { // травоядное может есть других травоядных (согласно вероятности)
                double foodWeight = ((Herbivor) food).currentWeight;


                if (this instanceof Rabbit || this instanceof Mouse) {
                    this.currentSatiety += foodWeight * 0.0005;
                    this.currentWeight += foodWeight * 0.0005;
                } else {

                    this.currentSatiety += foodWeight * 0.001;
                    this.currentWeight += foodWeight * 0.001;
                }

                System.out.println(this.getClass().getSimpleName() + " съел " + food.getClass().getSimpleName() + ". Текущая сытость: " + getCurrentSatiety());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }



    @Override
    public Herbivor reproduce() {
        // Создаём потомка через фабричный метод
        HerbivorFactory herbivorFactory = new HerbivorFactory(0,0);


        Herbivor child = herbivorFactory.createHerbivor(this.getClass());

        // вес и сытость детеныша
        child.setCurrentWeight(this.getMaxWeight() / 2);
        child.setCurrentSatiety(this.getFullSatiety() / 2);

        return child;


    }



    @Override
    public void decreaseSatiety() {
        double satietyLoss = this.getFullSatiety() * 0.1; // Теряется 10% от полного запаса сытости
        double weightLoss = this.getMaxWeight() * 0.05;   // Теряется 5% от максимального веса

        this.currentSatiety =  this.currentSatiety - satietyLoss;
        this.currentWeight =  this.currentWeight - weightLoss;

        System.out.println(this.getClass().getSimpleName() + " потерял сытость: " + satietyLoss +
                " | Потеря веса: " + weightLoss);
    }

    //Скорость для каждого животного
    @Override
    public int getSpeed() {
        // Возвращаем скорость на основе конкретного вида животного
        if (this instanceof Buffalo) return Settings.maxBuffaloSpeed;
        if (this instanceof Caterpillar) return Settings.maxCaterpillarSpeed;
        if (this instanceof Deer) return Settings.maxDeerSpeed;
        if (this instanceof Duck) return Settings.maxDuckSpeed;
        if (this instanceof Goat) return Settings.maxGoatSpeed;
        if (this instanceof Hog) return Settings.maxHogSpeed;
        if (this instanceof Horse) return Settings.maxHorseSpeed;
        if (this instanceof Mouse) return Settings.maxMouseSpeed;
        if (this instanceof Rabbit) return Settings.maxRabbitSpeed;
        if (this instanceof Sheep) return Settings.maxSheepSpeed;
        return 0; // Если вид не найден, возвращаем 0
    }

    @Override
    public String getSpecies() {
        return "Herbivor";
    }

    @Override
    public void move(Location[][] locations, int x, int y) {
        int moveProbability = getMoveProbability();

        // Генерация случайного числа для вероятности перемещения
        if (Math.random() * 100 > moveProbability) {
            return; // Если травоядное не перемещается
        }

        List<Location> neighbors = currentLocation.getNeighboringLocations();

        for (Location neighbor : neighbors) {
            // Проверка : локация не переполнена и может принять животное
            if (neighbor.canAddAnimal(this)) {
                // Клон животного и добавление в соседнюю локацию
                Animal clonedAnimal = this.clone();
                currentLocation.removeAnimal(this);
                currentLocation = neighbor;
                neighbor.addAnimal(clonedAnimal);  // Добавление клонированного животного

                // Вывод информации о перемещении
                System.out.println(this.getClass().getSimpleName() + " переместился в соседнюю локацию с шансом " +
                        moveProbability + "%.");
                break;
            }
        }
    }
    @Override
    public int getMoveProbability() {
        return getSpeed() * 10; // Скорость * 10, например, для скорости 2 вероятность 20%
    }


}


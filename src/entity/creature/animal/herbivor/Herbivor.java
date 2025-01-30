package entity.creature.animal.herbivor;


import config.Settings;
import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.animal.predator.*;
import entity.creature.plant.Plant;
import repository.HerbivorFactory;
import repository.PredatorFactory;


public class Herbivor extends Animal {

    boolean isAlive = true;
    public double maxWeight;

    Location location;

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

                // Для травоядных увеличиваем сытость и вес медленнее
                if (this instanceof Rabbit || this instanceof Mouse) {
                    // Для зайцев и мышей делаем коэффициенты меньше
                    this.currentSatiety += foodWeight * 0.005; // Уменьшаем коэффициент
                    this.currentWeight += foodWeight * 0.005; // Уменьшаем коэффициент
                } else {
                    // Для более крупных травоядных коэффициенты могут быть такими же, как раньше
                    this.currentSatiety += foodWeight * 0.01;
                    this.currentWeight += foodWeight * 0.01;
                }

            } else if (food instanceof Herbivor) { // Теперь травоядное может есть других травоядных
                double foodWeight = ((Herbivor) food).currentWeight;

                // Для зайцев и мышей тоже уменьшаем коэффициенты для еды травоядных
                if (this instanceof Rabbit || this instanceof Mouse) {
                    this.currentSatiety += foodWeight * 0.0005; // Уменьшаем коэффициент для травоядных
                    this.currentWeight += foodWeight * 0.0005; // Уменьшаем коэффициент для травоядных
                } else {
                    // Для более крупных травоядных коэффициенты могут быть стандартными
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
    public void move(){
       //пока не реализовано
    }


    @Override
    public Herbivor reproduce() {
        // Создаём потомка через фабричный метод
        HerbivorFactory herbivorFactory = new HerbivorFactory(0,0);

        // Используем getClass() для получения текущего типа хищника
        Herbivor child = herbivorFactory.createHerbivor(this.getClass());

        // Устанавливаем вес и сытость детеныша
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



}


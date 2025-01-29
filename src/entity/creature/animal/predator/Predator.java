package entity.creature.animal.predator;


import config.Settings;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.animal.herbivor.*;

import java.util.HashMap;
import java.util.Map;


public class Predator extends Animal {

                                                                              //Для учета вероятностей поедания
    public double maxWeight;
    boolean isAlive = true;

    public static final Map<Class<? extends Animal>, Map<Class<? extends Animal>, Integer>> predatorProbabilities = new HashMap<>();

    public Predator(double currentWeight,double currentSatiety){
        super(currentWeight,currentSatiety);

    }



    static {
        // Заполняем вероятности для волка
        Map<Class<? extends Animal>, Integer> wolfPrey = new HashMap<>();

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

        predatorProbabilities.put(Wolf.class, wolfPrey);

        // Заполняем вероятности для удава
        Map<Class<? extends Animal>, Integer> boaPrey = new HashMap<>();

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

        predatorProbabilities.put(Boa.class, boaPrey);

        // Заполняем вероятности для лисы
        Map<Class<? extends Animal>, Integer> foxPrey = new HashMap<>();

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

        predatorProbabilities.put(Fox.class, foxPrey);

        // Заполняем вероятности для медведя
        Map<Class<? extends Animal>, Integer> bearPrey = new HashMap<>();

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


        predatorProbabilities.put(Bear.class, bearPrey);

        // Заполняем вероятности для орла
        Map<Class<? extends Animal>, Integer> eaglePrey = new HashMap<>();

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

        predatorProbabilities.put(Eagle.class, eaglePrey);
    }
    public static int getProbability(Class<? extends Animal> predator, Class<? extends Animal> prey) {
        return predatorProbabilities.getOrDefault(predator, new HashMap<>()).getOrDefault(prey, 0);
    }


    @Override
    public void eat(Creature food) {
        if (food instanceof Herbivor) {
            lock.lock();
            try {
                double foodWeight = ((Herbivor) food).getCurrentWeight();

                // 🔹 Увеличиваем насыщенность и вес
                this.currentSatiety = Math.min(10, this.currentSatiety + foodWeight * 0.5);
                this.currentWeight = Math.min(10, this.currentWeight + foodWeight * 0.1);

                System.out.println(this.getClass().getSimpleName() + " съел " + food.getClass().getSimpleName() +
                        "; новая насыщенность: " + this.currentSatiety +
                        "; новый вес: " + this.currentWeight);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
    public boolean isOverfed() {
        return this.currentSatiety >= fullSatiety && this.currentWeight >= maxWeight;
    }


    @Override
    public void move(){
        //Пока не реализовано + добавлю рандом перехода животных на новую локу
    }

    @Override
    public Predator reproduce() {    //Условия размножения прописать в самом изненном цикле
        try {
            // Динамически создаем объект того же класса, что и this
            Predator child = this.getClass().getDeclaredConstructor().newInstance();
            child.setCurrentWeight(this.getMaxWeight()/2);
            child.setCurrentSatiety(this.getFullSatiety()/2);
            return child;
        } catch (Exception e) {
            e.printStackTrace();
            return null;                                       // Если не удалось создать, возвращаем null
        }
    }
        /*if (currentSatiety >= FullSatiety * 0.5) {
            currentSatiety -= FullSatiety * 0.2;

        }
       */


    //Смерть жертвы
    @Override
    public String die(Creature c) {  //Условия смерти  прописать в самом жизненном цикле
        String dieResult ="";
        if (this.isAlive) {
            if ((currentWeight < maxWeight / 2 || currentSatiety <= 0 ) || (currentWeight > maxWeight && currentSatiety > fullSatiety)) {
                dieResult = " die " + " weight:" + currentWeight;
                this.isAlive = false;
            }
        }
        return dieResult;
    }


    @Override
    public void decreaseSatiety() {
        this.currentSatiety -= 0;
        this.currentWeight -= 0;
    }
}



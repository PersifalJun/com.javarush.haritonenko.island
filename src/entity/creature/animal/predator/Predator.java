package entity.creature.animal.predator;

import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.animal.herbivor.Herbivor;



import java.util.Random;

public  class Predator extends Animal {

    public double maxWeight;
    public static double currentWeight;
    public static double currentSatiety;
    private Random random;
    boolean isAlive = true;

    public Predator(double currentWeight,double currentSatiety){
        super(currentWeight,currentSatiety);

    }

    @Override
    public synchronized void eat(Creature food) {
        if(food instanceof Herbivor){
            lock.lock();
            try {
                double foodWeight = ((Herbivor) food).currentWeight;
                this.currentSatiety = Math.min(FullSatiety, currentSatiety + foodWeight * 0.5);
                this.currentWeight += foodWeight*0.1;
                System.out.println("Predator eat " + food.getClass().getSimpleName() + "  satiety:" + currentSatiety + " weight:" + currentWeight );
            }
            catch(Exception e ){
                e.printStackTrace();

            }
            lock.unlock();

        }

    }


    @Override
    public void move(){
        //Пока не реализовано
    }

    @Override
    public Creature reproduce() {
        if (currentSatiety >= FullSatiety * 0.5) {
            currentSatiety -= FullSatiety * 0.2;

        }
        return new Predator(currentWeight / 2, currentSatiety / 2);
    }

    @Override
    public void die(Creature c) {
        if (this.isAlive) {
            if (currentWeight < maxWeight / 2 && currentSatiety <= 0 || currentWeight > maxWeight && currentSatiety > FullSatiety) {
                System.out.println("Predator die " + " weight:" + currentWeight);
                this.isAlive = false;
            }
        }
    }
    @Override
    public void decreaseSatiety() {
        this.currentSatiety -= 0.5;
    }
}



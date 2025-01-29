package entity.creature.animal.herbivor;


import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.plant.Plant;


public class Herbivor extends Animal {

    boolean isAlive = true;
    public double maxWeight;

    Location location;

    public Herbivor(double currentWeight, double currentSatiety) {

        super(currentWeight, currentSatiety);
    }
    public double getCurrentWeight() {
        return currentWeight;
    }

    public double getCurrentSatiety() {
        return currentSatiety;
    }

    @Override
    public synchronized void eat(Creature food) {

        if(food instanceof Plant){
            lock.lock();
            try {
                double foodWeight = ((Plant) food).weight;
                this.currentSatiety = Math.min(fullSatiety, currentSatiety + foodWeight * 0.8);
                this.currentWeight += foodWeight * 0.1;


            }
            catch(Exception e ){
                e.printStackTrace();
            }

            lock.unlock();

        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    }

    @Override
    public void move(){
       //пока не реализовано
    }


    @Override
    public Herbivor reproduce() {
        try {
            Herbivor child = this.getClass().getDeclaredConstructor().newInstance();
            child.setCurrentWeight(this.getCurrentWeight()/2);
            child.setCurrentSatiety(this.getCurrentSatiety()/2);
            return child;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        }




    @Override
    public String die(Creature c) {
        String dieResult = "";
        if (isAlive) {
            if ((currentWeight < maxWeight / 2 || currentSatiety <= 0) || (currentWeight > maxWeight && currentSatiety > fullSatiety)) {
                dieResult = " die " + " weight:" + currentWeight;
                isAlive = false;

            }
        }
        return dieResult;
    }



    @Override
    public void decreaseSatiety() {
        this.currentSatiety -= 0;
        this.currentWeight  -= 0 ;
    }



}


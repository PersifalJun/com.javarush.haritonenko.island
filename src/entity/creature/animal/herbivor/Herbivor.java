package entity.creature.animal.herbivor;


import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.animal.predator.Predator;
import entity.creature.plant.Plant;


public class Herbivor extends Animal {

    boolean isAlive = true;
    public double maxWeight;

    Location location;

    public Herbivor(double currentWeight, double currentSatiety) {

        super(currentWeight, currentSatiety);
    }


    @Override
    public synchronized String eat(Creature food) {
        String eatResult = "";
        if(food instanceof Plant){
            lock.lock();
            try {
                double foodWeight = ((Plant) food).weight;
                this.currentSatiety = Math.min(fullSatiety, currentSatiety + foodWeight * 0.8);
                this.currentWeight += foodWeight * 0.1;
                eatResult = " eat: " + food.getClass().getSimpleName() + ";" + "  satiety:" + currentSatiety + " weight:" + currentWeight;

            }
            catch(Exception e ){
                e.printStackTrace();
            }

            lock.unlock();

        }
        return eatResult;
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

        /*if (currentSatiety >= FullSatiety * 0.5) {
            currentSatiety -= FullSatiety * 0.2;

         */
        }




    @Override
    public String die(Creature c) {
        String dieResult = "";
        if (isAlive) {
            if ((currentWeight < maxWeight / 2 || currentSatiety <= 0) || (currentWeight > maxWeight && currentSatiety > fullSatiety)) {
                dieResult = " die " + " weight:" + currentWeight;
                isAlive = false;
                location.removeAnimal((Animal) c);
            }
        }
        return dieResult;
    }

    public void selfDie(){

        location.removeAnimal(this);
    }


    @Override
    public void decreaseSatiety() {
        this.currentSatiety -= 1;
        this.currentWeight  -= 0.5 ;
    }



}


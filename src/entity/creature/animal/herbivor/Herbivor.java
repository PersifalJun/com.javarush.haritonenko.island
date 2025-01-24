package entity.creature.animal.herbivor;


import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.plant.Plant;


public class Herbivor extends Animal {
    public int weight;
    boolean isAlive = true;
    public double maxWeight;

    Location Location;

    public Herbivor(double currentWeight, double currentSatiety) {

        super(currentWeight, currentSatiety);
    }

    @Override
    public synchronized void eat(Creature food) {
        if(food instanceof Plant){
            lock.lock();
            try {
                double foodWeight = ((Plant) food).weight;
                this.currentSatiety = Math.min(FullSatiety, currentSatiety + foodWeight * 0.8);
                this.currentWeight += foodWeight * 0.1;
                System.out.println("Herbivor eat " + food.getClass().getSimpleName() + "  satiety:" + currentSatiety + " weight:" + currentWeight);
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
    public  Creature reproduce() {
        if (currentSatiety >= FullSatiety * 0.5) {
            currentSatiety -= FullSatiety * 0.2;

        }
            return new Herbivor(currentWeight / 2 , currentSatiety / 2);
        }




    @Override
    public void die(Creature c) {
        if (isAlive) {
            if (currentWeight < maxWeight / 2 && currentSatiety <= 0 || currentWeight > maxWeight && currentSatiety > FullSatiety) {
                System.out.println("Predator die " + " weight:" + currentWeight);
                isAlive = false;
                Location.removeAnimal((Animal) c);
            }
        }
    }


    @Override
    public void decreaseSatiety() {
        this.currentSatiety -= 3;
    }



}


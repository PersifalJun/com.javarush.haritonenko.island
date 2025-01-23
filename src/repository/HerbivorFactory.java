package repository;

import entity.creature.animal.herbivor.Herbivor;
import entity.creature.animal.herbivor.*;
import entity.creature.animal.predator.Wolf;
import java.util.Random;

public class HerbivorFactory extends Herbivor {

    Random random = new Random();

    public HerbivorFactory(double currentWeight, double currentSatiety) {
        super(currentWeight, currentSatiety);
    }

    public Herbivor createHerbivor(Herbivor[] h){
        if (h instanceof Sheep[]){
            return new Sheep(random.nextDouble(Sheep.maxWeight)+1,random.nextDouble(Sheep.fullSatiety)+1);
        }
        else if (h instanceof Rabbit[]){
            return new Rabbit(random.nextDouble(Rabbit.maxWeight)+1,random.nextDouble(Rabbit.fullSatiety)+1);
        }
        else if (h instanceof Mouse[]){
            return new Mouse(random.nextDouble(Mouse.maxWeight)+1,random.nextDouble(Mouse.fullSatiety)+1);
        }
        else if (h instanceof Horse[]){
            return new Horse(random.nextDouble(Horse.maxWeight)+1,random.nextDouble(Horse.fullSatiety)+1);
        }
        else if (h instanceof Hog[]){
            return new Hog(random.nextDouble(Hog.maxWeight)+1,random.nextDouble(Hog.fullSatiety)+1);
        }
        else if (h instanceof Goat[]){
            return new Goat(random.nextDouble(Goat.maxWeight)+1,random.nextDouble(Goat.fullSatiety)+1);
        }
        else if (h instanceof Duck[]){
            return new Duck(random.nextDouble(Duck.maxWeight)+1,random.nextDouble(Duck.fullSatiety)+1);
        }
        else if (h instanceof Deer[]) {
            return new Deer(random.nextDouble(Deer.maxWeight)+1,random.nextDouble(Deer.fullSatiety)+1);
        }
        else if (h instanceof Caterpillar[]) {
            return new Caterpillar(Caterpillar.maxWeight,Caterpillar.fullSatiety);
        }
        else {
            return new Buffalo(random.nextDouble(Deer.maxWeight)+1,random.nextDouble(Deer.fullSatiety)+1);
        }

    }


}

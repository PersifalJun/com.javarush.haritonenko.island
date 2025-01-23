package repository;


import entity.creature.Creature;
import entity.creature.animal.predator.Predator;
import entity.creature.animal.predator.*;
import java.util.Random;

public class PredatorFactory extends Predator {

    static Random random = new Random();

    public PredatorFactory(double currentWeight, double currentSatiety) {
        super(currentWeight, currentSatiety);
    }


    public Predator createPredator(Predator[] p){
        if (p instanceof Wolf[]){
            return new Wolf(random.nextDouble(Wolf.maxWeight)+1,random.nextDouble(Wolf.fullSatiety)+1);
        }
        else if (p instanceof Eagle[]){
            return new Eagle(random.nextDouble(Eagle.maxWeight)+1,random.nextDouble(Eagle.fullSatiety)+1);
        }
        else if (p instanceof Boa[]){
            return new Boa(random.nextDouble(Boa.maxWeight)+1,random.nextDouble(Boa.fullSatiety)+1);
        }
        else if (p instanceof Bear[]) {
            return new Bear(random.nextDouble(Boa.maxWeight)+1,random.nextDouble(Boa.fullSatiety)+1);
        }
        else {
            return new Fox(random.nextDouble(Fox.maxWeight)+1,random.nextDouble(Fox.fullSatiety)+1);

        }


    }
    @Override
    public void eat(Creature food) {

    }
}

package repository;


import config.Settings;
import entity.creature.Creature;
import entity.creature.animal.predator.Predator;
import entity.creature.animal.predator.*;
import java.util.Random;

public class PredatorFactory extends Predator  {

    static Random random = new Random();



    public PredatorFactory(double currentWeight, double currentSatiety) {
        super(currentWeight,currentSatiety);
    }


    public Predator createPredator(Predator[] p){
        if (p instanceof Wolf[]){
            return new Wolf(random.nextDouble(Settings.maxWolfWeight/2,Settings.maxWolfWeight),random.nextDouble(Settings.WolfFullSatiety)+1);
        }
        else if (p instanceof Eagle[]){
            return new Eagle(random.nextDouble(Settings.maxEagleWeight/2,Settings.maxEagleWeight),random.nextDouble(Settings.EagleFullSatiety)+1);
        }
        else if (p instanceof Boa[]){
            return new Boa(random.nextDouble(Settings.maxBoaWeight/2,Settings.maxBoaWeight),random.nextDouble(Settings.BoaFullSatiety)+1);
        }
        else if (p instanceof Bear[]) {
            return new Bear(random.nextDouble(Settings.maxBearWeight/2,Settings.maxBearWeight),random.nextDouble(Settings.BearFullSatiety)+1);
        }
        else {
            return new Fox(random.nextDouble(Settings.maxFoxWeight/2,Settings.maxFoxWeight),random.nextDouble(Settings.FoxFullSatiety)+1);

        }


    }

}

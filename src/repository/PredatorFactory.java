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


    public Predator createPredator(Class<? extends Predator> predatorType) {
        if (predatorType.equals(Wolf.class)) {
            return new Wolf(random.nextDouble(Settings.maxWolfWeight / 2, Settings.maxWolfWeight),
                    random.nextDouble(Settings.WolfFullSatiety) + 1);
        }
        else if (predatorType.equals(Eagle.class)) {
            return new Eagle(random.nextDouble(Settings.maxEagleWeight / 2, Settings.maxEagleWeight),
                    random.nextDouble(Settings.EagleFullSatiety) + 1);
        }
        else if (predatorType.equals(Boa.class)) {
            return new Boa(random.nextDouble(Settings.maxBoaWeight / 2, Settings.maxBoaWeight),
                    random.nextDouble(Settings.BoaFullSatiety) + 1);
        }
        else if (predatorType.equals(Bear.class)) {
            return new Bear(random.nextDouble(Settings.maxBearWeight / 2, Settings.maxBearWeight),
                    random.nextDouble(Settings.BearFullSatiety) + 1);
        }
        else if (predatorType.equals(Fox.class)) {
            return new Fox(random.nextDouble(Settings.maxFoxWeight / 2, Settings.maxFoxWeight),
                    random.nextDouble(Settings.FoxFullSatiety) + 1);
        }
        else {
            throw new IllegalArgumentException("Unknown predator type");
        }
    }

}

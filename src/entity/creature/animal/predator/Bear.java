package entity.creature.animal.predator;


import config.Settings;
import entity.creature.animal.Animal;


import java.util.HashMap;
import java.util.Map;


public class Bear extends Predator{


    public final Map<Class<? extends Animal>, Integer> wolfHuntingProbability = new HashMap<>();
    public Bear(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    @Override
    public double getMaxWeight(){
        return Settings.maxBearWeight;
    }



    @Override
    public double getFullSatiety(){
        return Settings.BearFullSatiety;
    }




}

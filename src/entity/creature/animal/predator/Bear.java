package entity.creature.animal.predator;


import config.Settings;

import java.util.Random;

public class Bear extends Predator{



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

package entity.creature.animal.predator;


import config.Settings;

import java.util.Random;

public class Bear extends Predator{



    public Bear(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }
    public double getMaxWeight(){
        return Settings.maxBearWeight;
    }

    @Override
    public double getCurrentWeight(){return currentWeight;}
    @Override
    public double getCurrentSatiety(){return currentSatiety;}


    public double getMaxSatiety(){
        return Settings.BearFullSatiety;
    }



}

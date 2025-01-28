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




    public double getMaxSatiety(){
        return Settings.BearFullSatiety;
    }



}

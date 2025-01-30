package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;


public class Buffalo extends Herbivor {




    public Buffalo(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
        setSpecies("Buffalo");
    }

    @Override
    public double getMaxWeight(){
        return Settings.maxBuffaloWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.BuffaloFullSatiety;
    }







}

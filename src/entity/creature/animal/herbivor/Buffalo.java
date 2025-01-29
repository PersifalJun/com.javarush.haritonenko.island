package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;


public class Buffalo extends Herbivor implements Eatable {




    public Buffalo(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    @Override
    public double getMaxWeight(){
        return Settings.maxBuffaloWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.BuffaloFullSatiety;
    }







    @Override
    public void beEaten() {
        //die();
    }

}

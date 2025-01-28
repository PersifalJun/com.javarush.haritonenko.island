package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;


public class Buffalo extends Herbivor implements Eatable {




    public Buffalo(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }


    public double getMaxWeight(){
        return Settings.maxBuffaloWeight;
    }

    public double getMaxSatiety(){
        return Settings.BuffaloFullSatiety;
    }







    @Override
    public void beEaten() {
        //die();
    }

}

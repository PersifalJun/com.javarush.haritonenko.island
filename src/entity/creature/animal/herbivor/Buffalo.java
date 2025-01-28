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


    public double getCurrentWeight(){return currentWeight;}

    public double getCurrentSatiety(){return currentSatiety;}








    @Override
    public void beEaten() {
        //die();
    }

}

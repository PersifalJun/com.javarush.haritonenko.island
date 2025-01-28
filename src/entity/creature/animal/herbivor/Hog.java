package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;



public class Hog extends Herbivor implements Eatable {




    public Hog(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    public double getMaxWeight(){
        return Settings.maxHogWeight;
    }

    public double getMaxSatiety(){
        return Settings.HogFullSatiety;
    }

    public double getCurrentWeight(){return currentWeight;}

    public double getCurrentSatiety(){return currentSatiety;}


    @Override
    public void beEaten() {
        //die();
    }
}

package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;



public class Hog extends Herbivor implements Eatable {




    public Hog(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    @Override
    public double getMaxWeight(){
        return Settings.maxHogWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.HogFullSatiety;
    }




    @Override
    public void beEaten() {
        //die();
    }
}

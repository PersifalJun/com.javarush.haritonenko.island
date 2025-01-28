package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;



public class Deer extends Herbivor implements Eatable{



    public Deer(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    public double getMaxWeight(){
        return Settings.maxDeerWeight;
    }

    public double getMaxSatiety(){
        return Settings.DeerFullSatiety;
    }





    @Override
    public void beEaten() {
        //die();
    }
}


package entity.creature.animal.herbivor;

import config.Settings;
import entity.creature.Eatable;




public class Horse extends Herbivor implements Eatable {


    public Horse(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    public double getMaxWeight(){
        return Settings.maxHorseWeight;
    }

    public double getMaxSatiety(){
        return Settings.HorseFullSatiety;
    }

    public double getCurrentWeight(){return currentWeight;}

    public double getCurrentSatiety(){return currentSatiety;}

    @Override
    public void beEaten() {
        //die();
    }
}


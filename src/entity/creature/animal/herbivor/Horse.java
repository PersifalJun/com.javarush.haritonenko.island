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



    @Override
    public void beEaten() {
        //die();
    }
}


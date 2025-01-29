package entity.creature.animal.herbivor;

import config.Settings;
import entity.creature.Eatable;




public class Horse extends Herbivor implements Eatable {


    public Horse(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }
    @Override
    public double getMaxWeight(){
        return Settings.maxHorseWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.HorseFullSatiety;
    }



    @Override
    public void beEaten() {
        //die();
    }
}


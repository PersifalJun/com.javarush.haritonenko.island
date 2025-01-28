package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Goat extends Herbivor implements Eatable {



    public Goat(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    public double getMaxWeight(){
        return Settings.maxGoatWeight;
    }

    public double getMaxSatiety(){
        return Settings.GoatFullSatiety;
    }





    @Override
    public void beEaten() {
        //die();
    }

}


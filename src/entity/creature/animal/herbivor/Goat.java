package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Goat extends Herbivor implements Eatable {



    public Goat(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    @Override
    public double getMaxWeight(){
        return Settings.maxGoatWeight;
    }

    @Override
    public double getFullSatiety(){
        return Settings.GoatFullSatiety;
    }





    @Override
    public void beEaten() {
        //die();
    }

}


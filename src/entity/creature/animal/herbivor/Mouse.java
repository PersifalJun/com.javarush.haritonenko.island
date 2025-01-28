package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Mouse extends Herbivor implements Eatable {



    public Mouse(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }
    public double getMaxWeight(){
        return Settings.maxMouseWeight;
    }

    public double getMaxSatiety(){
        return Settings.MouseFullSatiety;
    }



    @Override
    public void beEaten() {
        //die();
    }
}


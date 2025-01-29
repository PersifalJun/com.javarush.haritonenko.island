package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Mouse extends Herbivor implements Eatable {



    public Mouse(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }
    @Override
    public double getMaxWeight(){
        return Settings.maxMouseWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.MouseFullSatiety;
    }



    @Override
    public void beEaten() {
        //die();
    }
}


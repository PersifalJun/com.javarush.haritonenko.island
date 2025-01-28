package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Duck extends Herbivor implements Eatable {



    public Duck(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    public double getMaxWeight(){
        return Settings.maxDuckWeight;
    }

    public double getMaxSatiety(){
        return Settings.DuckFullSatiety;
    }




    @Override
    public void beEaten() {
        //die();
    }
}

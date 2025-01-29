package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Duck extends Herbivor implements Eatable {



    public Duck(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }
    @Override
    public double getMaxWeight(){
        return Settings.maxDuckWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.DuckFullSatiety;
    }




    @Override
    public void beEaten() {
        //die();
    }
}

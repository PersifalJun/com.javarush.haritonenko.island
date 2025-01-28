package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Sheep extends Herbivor implements Eatable {




    public Sheep(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    public double getMaxWeight(){
        return Settings.maxSheepWeight;
    }

    public double getMaxSatiety(){
        return Settings.SheepFullSatiety;
    }

    public double getCurrentWeight(){return currentWeight;}

    public double getCurrentSatiety(){return currentSatiety;}


    @Override
    public void beEaten() {

    }
}

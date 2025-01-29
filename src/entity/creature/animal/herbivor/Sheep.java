package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Sheep extends Herbivor implements Eatable {




    public Sheep(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }
    @Override
    public double getMaxWeight(){
        return Settings.maxSheepWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.SheepFullSatiety;
    }




    @Override
    public void beEaten() {

    }
}

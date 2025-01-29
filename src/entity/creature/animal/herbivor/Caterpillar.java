package entity.creature.animal.herbivor;



import config.Settings;
import entity.creature.Eatable;


public class Caterpillar extends Herbivor implements Eatable {



    public Caterpillar(double currentWeight,double currentSatiety) {

        super(currentWeight,currentSatiety);
    }

    @Override
    public double getMaxWeight(){
        return Settings.maxCaterpillarWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.CaterpillarFullSatiety;
    }



    @Override
    public void beEaten() {
        //die();
    }

}

package entity.creature.animal.herbivor;



import config.Settings;
import entity.creature.Eatable;


public class Caterpillar extends Herbivor implements Eatable {



    public Caterpillar(double currentWeight,double currentSatiety) {

        super(currentWeight,currentSatiety);
    }


    public double getMaxWeight(){
        return Settings.maxCaterpillarWeight;
    }

    public double getMaxSatiety(){
        return Settings.CaterpillarFullSatiety;
    }



    @Override
    public void beEaten() {
        //die();
    }

}

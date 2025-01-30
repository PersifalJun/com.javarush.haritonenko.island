package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;



public class Deer extends Herbivor {



    public Deer(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
        setSpecies("Deer");
    }
    @Override
    public double getMaxWeight(){
        return Settings.maxDeerWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.DeerFullSatiety;
    }






}


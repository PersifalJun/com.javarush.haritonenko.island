package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Duck extends Herbivor  {



    public Duck(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
        setSpecies("Duck");
    }
    @Override
    public double getMaxWeight(){
        return Settings.maxDuckWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.DuckFullSatiety;
    }





}

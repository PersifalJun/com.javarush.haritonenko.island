package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Sheep extends Herbivor  {




    public Sheep(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
        setSpecies("Sheep");
    }
    @Override
    public double getMaxWeight(){
        return Settings.maxSheepWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.SheepFullSatiety;
    }





}

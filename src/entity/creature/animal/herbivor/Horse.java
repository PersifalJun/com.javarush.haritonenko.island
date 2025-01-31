package entity.creature.animal.herbivor;

import config.Settings;





public class Horse extends Herbivor  {


    public Horse(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
        setSpecies("Horse");
    }
    @Override
    public double getMaxWeight(){
        return Settings.maxHorseWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.HorseFullSatiety;
    }




}


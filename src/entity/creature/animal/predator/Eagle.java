package entity.creature.animal.predator;


import config.Settings;

public class Eagle extends Predator{


    public Eagle(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
        setSpecies("Eagle");
    }
    @Override
    public double getMaxWeight(){
        return Settings.maxEagleWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.EagleFullSatiety;
    }


}


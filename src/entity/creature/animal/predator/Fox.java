package entity.creature.animal.predator;


import config.Settings;

public class Fox extends Predator{




    public Fox(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
        setSpecies("Fox");
    }
    @Override
    public double getMaxWeight(){
        return Settings.maxFoxWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.FoxFullSatiety;
    }




}



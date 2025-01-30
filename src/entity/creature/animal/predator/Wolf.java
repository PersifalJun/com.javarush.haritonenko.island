package entity.creature.animal.predator;


import config.Settings;

public class Wolf extends Predator{





    public Wolf(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
        setSpecies("Wolf");
    }

    @Override
    public double getMaxWeight(){
        return Settings.maxWolfWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.WolfFullSatiety;
    }



}






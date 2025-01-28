package entity.creature.animal.predator;


import config.Settings;

public class Wolf extends Predator{





    public Wolf(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    public double getMaxWeight(){
        return Settings.maxWolfWeight;
    }

    public double getMaxSatiety(){
        return Settings.WolfFullSatiety;
    }



}






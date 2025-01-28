package entity.creature.animal.predator;


import config.Settings;

public class Eagle extends Predator{




    public Eagle(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    public double getMaxWeight(){
        return Settings.maxEagleWeight;
    }

    public double getMaxSatiety(){
        return Settings.EagleFullSatiety;
    }




}


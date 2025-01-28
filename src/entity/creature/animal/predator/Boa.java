package entity.creature.animal.predator;


import config.Settings;

public class Boa extends Predator{



    public Boa(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    public double getMaxWeight(){
        return Settings.maxBoaWeight;
    }

    public double getMaxSatiety(){
        return Settings.BoaFullSatiety;
    }



}

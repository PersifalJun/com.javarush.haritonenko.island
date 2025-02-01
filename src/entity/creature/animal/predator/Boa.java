package entity.creature.animal.predator;


import config.Settings;

public class Boa extends Predator{



    public Boa(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);

    }
    @Override
    public double getMaxWeight(){
        return Settings.maxBoaWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.BoaFullSatiety;
    }



}

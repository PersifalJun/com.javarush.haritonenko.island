package entity.creature.animal.predator;


import config.Settings;

public class Fox extends Predator{




    public Fox(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    public double getMaxWeight(){
        return Settings.maxFoxWeight;
    }

    public double getMaxSatiety(){
        return Settings.FoxFullSatiety;
    }

    public double getCurrentWeight(){return currentWeight;}

    public double getCurrentSatiety(){return currentSatiety;}


}



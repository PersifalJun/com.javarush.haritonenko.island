package entity.creature.animal.herbivor;


import config.Settings;



public class Buffalo extends Herbivor {




    public Buffalo(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);

    }

    @Override
    public double getMaxWeight(){
        return Settings.maxBuffaloWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.BuffaloFullSatiety;
    }







}

package entity.creature.animal.herbivor;


import config.Settings;





public class Sheep extends Herbivor  {




    public Sheep(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);

    }
    @Override
    public double getMaxWeight(){
        return Settings.maxSheepWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.SheepFullSatiety;
    }





}

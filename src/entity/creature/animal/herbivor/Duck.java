package entity.creature.animal.herbivor;


import config.Settings;





public class Duck extends Herbivor  {



    public Duck(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);

    }
    @Override
    public double getMaxWeight(){
        return Settings.maxDuckWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.DuckFullSatiety;
    }





}

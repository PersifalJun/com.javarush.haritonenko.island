package entity.creature.animal.herbivor;


import config.Settings;





public class Mouse extends Herbivor  {



    public Mouse(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
        setSpecies("Mouse");
    }
    @Override
    public double getMaxWeight(){
        return Settings.maxMouseWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.MouseFullSatiety;
    }




}


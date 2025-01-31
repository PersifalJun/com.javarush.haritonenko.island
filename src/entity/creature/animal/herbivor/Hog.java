package entity.creature.animal.herbivor;


import config.Settings;




public class Hog extends Herbivor  {




    public Hog(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
        setSpecies("Hog");
    }

    @Override
    public double getMaxWeight(){
        return Settings.maxHogWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.HogFullSatiety;
    }





}

package entity.creature.animal.herbivor;


import config.Settings;





public class Goat extends Herbivor {



    public Goat(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
        setSpecies("Goat");
    }

    @Override
    public double getMaxWeight(){
        return Settings.maxGoatWeight;
    }

    @Override
    public double getFullSatiety(){
        return Settings.GoatFullSatiety;
    }







}


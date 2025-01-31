package entity.creature.animal.herbivor;



import config.Settings;



public class Caterpillar extends Herbivor {



    public Caterpillar(double currentWeight,double currentSatiety) {

        super(currentWeight,currentSatiety);
        setSpecies("Caterpillar");
    }

    @Override
    public double getMaxWeight(){
        return Settings.maxCaterpillarWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.CaterpillarFullSatiety;
    }





}

package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Rabbit extends Herbivor  {




    public Rabbit(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
        setSpecies("Rabbit");
    }
    @Override
    public double getMaxWeight(){
        return Settings.maxRabbitWeight;
    }
    @Override
    public double getFullSatiety(){
        return Settings.RabbitFullSatiety;
    }






}

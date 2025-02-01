package entity.creature.animal.herbivor;


import config.Settings;





public class Rabbit extends Herbivor  {




    public Rabbit(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);

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

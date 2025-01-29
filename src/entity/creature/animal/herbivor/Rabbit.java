package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Rabbit extends Herbivor implements Eatable {




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




    @Override
    public void beEaten() {
        //die();
    }

}

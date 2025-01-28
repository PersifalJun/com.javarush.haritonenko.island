package entity.creature.animal.herbivor;


import config.Settings;
import entity.creature.Eatable;




public class Rabbit extends Herbivor implements Eatable {




    public Rabbit(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }

    public double getMaxWeight(){
        return Settings.maxRabbitWeight;
    }

    public double getMaxSatiety(){
        return Settings.RabbitFullSatiety;
    }

    public double getCurrentWeight(){return currentWeight;}

    public double getCurrentSatiety(){return currentSatiety;}


    @Override
    public void beEaten() {
        //die();
    }

}

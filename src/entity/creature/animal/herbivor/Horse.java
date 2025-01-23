package entity.creature.animal.herbivor;

import entity.creature.Eatable;




public class Horse extends Herbivor implements Eatable {
    public static double maxWeight = 40;
    private final int maxSpeed = 4;
    public static double fullSatiety = 60;



    public Horse(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }


    @Override
    public void beEaten() {
        //die();
    }
}


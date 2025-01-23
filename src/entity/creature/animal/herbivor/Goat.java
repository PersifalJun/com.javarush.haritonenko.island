package entity.creature.animal.herbivor;


import entity.creature.Eatable;




public class Goat extends Herbivor implements Eatable {
    public static double maxWeight = 60;
    private final int maxSpeed = 3;
    public static double fullSatiety = 10;



    public Goat(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }


    @Override
    public void beEaten() {
        //die();
    }

}


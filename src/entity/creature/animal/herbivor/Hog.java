package entity.creature.animal.herbivor;


import entity.creature.Eatable;



public class Hog extends Herbivor implements Eatable {
    public static double maxWeight = 400;
    private final int maxSpeed = 2;
    public static double fullSatiety = 50;



    public Hog(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }



    @Override
    public void beEaten() {
        //die();
    }
}

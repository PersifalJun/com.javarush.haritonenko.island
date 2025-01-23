package entity.creature.animal.herbivor;


import entity.creature.Eatable;



public class Deer extends Herbivor implements Eatable{
    public static double maxWeight = 300;
    private final int maxSpeed = 4;
    public static double fullSatiety = 50;



    public Deer(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }


    @Override
    public void beEaten() {
        //die();
    }
}


package entity.creature.animal.herbivor;


import entity.creature.Eatable;




public class Sheep extends Herbivor implements Eatable {
    public static double maxWeight = 70;
    private final int maxSpeed = 3;
    public static double fullSatiety = 15;



    public Sheep(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }


    @Override
    public void beEaten() {

    }
}

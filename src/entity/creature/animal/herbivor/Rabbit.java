package entity.creature.animal.herbivor;


import entity.creature.Eatable;




public class Rabbit extends Herbivor implements Eatable {

    public static double maxWeight = 2;
    private final int maxSpeed = 2;
    public static double fullSatiety = 0.45;



    public Rabbit(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }


    @Override
    public void beEaten() {
        //die();
    }

}

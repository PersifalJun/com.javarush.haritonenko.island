package entity.creature.animal.herbivor;


import entity.creature.Eatable;




public class Duck extends Herbivor implements Eatable {
    public static double maxWeight = 1;
    private final int maxSpeed = 4;
    public static double fullSatiety = 0.15;



    public Duck(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }


    @Override
    public void beEaten() {
        //die();
    }
}

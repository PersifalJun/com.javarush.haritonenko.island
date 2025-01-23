package entity.creature.animal.herbivor;



import entity.creature.Eatable;


public class Caterpillar extends Herbivor implements Eatable {
    public static double maxWeight = 0.01;
    private final int maxSpeed = 0;
    public static double fullSatiety = 0;

    //Текущие данные


    public Caterpillar(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }



    @Override
    public void beEaten() {
        //die();
    }

}

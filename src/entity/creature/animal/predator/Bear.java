package entity.creature.animal.predator;


import java.util.Random;

public class Bear extends Predator{

    public static double maxWeight = 500;
    private final int maxSpeed = 2;
    public static double fullSatiety = 80;

    //Текущие данные
    public double currentWeight;
    public double currentSatiety;
    private Random random;
    boolean isAlive = true;

    public Bear(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }



}

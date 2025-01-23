package entity.creature.animal.predator;



public class Fox extends Predator{

    public static double maxWeight = 8;
    private final int maxSpeed = 2;
    public static double fullSatiety = 2;



    public Fox(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }


}



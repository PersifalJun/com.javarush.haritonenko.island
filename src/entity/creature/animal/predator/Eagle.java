package entity.creature.animal.predator;



public class Eagle extends Predator{

    public static double maxWeight = 6;
    private final int maxSpeed = 3;
    public static double fullSatiety = 1;



    public Eagle(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }


}


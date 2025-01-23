package entity.creature.animal.predator;



public class Boa extends Predator{
    public static double maxWeight = 15;
    private final int maxSpeed = 1;
    public static double fullSatiety = 3;



    public Boa(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }


}

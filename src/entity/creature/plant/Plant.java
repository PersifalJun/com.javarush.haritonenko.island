package entity.creature.plant;

import entity.creature.Creature;
import entity.creature.Eatable;
import java.util.concurrent.ThreadLocalRandom;

public class Plant extends Creature implements Eatable {
    public double weight = 1;
    int maxPlantCount = 200;
    ThreadLocalRandom random = ThreadLocalRandom.current();


    public Plant(){
        this.weight = random.nextInt(1,5);
    }
    public Plant(double weight){
        this.weight = weight;
    }


    @Override
    public void beEaten() {

    }
}

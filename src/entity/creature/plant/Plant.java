package entity.creature.plant;

import entity.creature.Creature;
import entity.creature.Eatable;
import java.util.Random;



public class Plant extends Creature implements Eatable {
    Random random = new Random();
    public double weight = 1;
    int maxPlantCount = 200;



    public Plant(double weight){

        this.weight = weight;
    }

    public void setWeight(double weight){

        this.weight = weight;
    }


    @Override
    public void beEaten() {

    }
}

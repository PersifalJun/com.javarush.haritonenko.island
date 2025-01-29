package entity.creature.plant;

import config.Settings;
import entity.creature.Creature;
import entity.creature.Eatable;
import java.util.Random;



public class Plant extends Creature implements Eatable {

    public double weight;




    public Plant(double weight){
        this.weight = weight;
    }

    public double getWeight() {
        return Settings.maxPlantWeight;
    }

    @Override
    public void beEaten() {

    }
}

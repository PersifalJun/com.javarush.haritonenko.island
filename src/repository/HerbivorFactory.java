package repository;

import config.Settings;
import entity.creature.animal.herbivor.Herbivor;
import entity.creature.animal.herbivor.*;
import java.util.Random;

public class HerbivorFactory extends Herbivor {

    Random random = new Random();

    public HerbivorFactory(double currentWeight, double currentSatiety) {
        super(currentWeight, currentSatiety);
    }

    public Herbivor createHerbivor(Herbivor[] h){
        if (h instanceof Sheep[]){
            return new Sheep(random.nextDouble(Settings.maxSheepWeight/2,Settings.maxSheepWeight),random.nextDouble(Settings.SheepFullSatiety)+1);
        }
        else if (h instanceof Rabbit[]){
            return new Rabbit(random.nextDouble(Settings.maxRabbitWeight/2,Settings.maxRabbitWeight),random.nextDouble(Settings.RabbitFullSatiety)+1);
        }
        else if (h instanceof Mouse[]){
            return new Mouse(random.nextDouble(Settings.maxMouseWeight/2,Settings.maxMouseWeight),random.nextDouble(Settings.MouseFullSatiety)+1);
        }
        else if (h instanceof Horse[]){
            return new Horse(random.nextDouble(Settings.maxHorseWeight/2,Settings.maxHorseWeight),random.nextDouble(Settings.HorseFullSatiety)+1);
        }
        else if (h instanceof Hog[]){
            return new Hog(random.nextDouble(Settings.maxHogWeight/2,Settings.maxHogWeight),random.nextDouble(Settings.HogFullSatiety)+1);
        }
        else if (h instanceof Goat[]){
            return new Goat(random.nextDouble(Settings.maxGoatWeight/2,Settings.maxGoatWeight),random.nextDouble(Settings.GoatFullSatiety)+1);
        }
        else if (h instanceof Duck[]){
            return new Duck(random.nextDouble(Settings.maxDuckWeight/2,Settings.maxDuckWeight),random.nextDouble(Settings.DuckFullSatiety)+1);
        }
        else if (h instanceof Deer[]) {
            return new Deer(random.nextDouble(Settings.maxDeerWeight/2,Settings.maxDeerWeight),random.nextDouble(Settings.DeerFullSatiety)+1);
        }
        else if (h instanceof Caterpillar[]) {
            return new Caterpillar(Settings.maxCaterpillarWeight,Settings.CaterpillarFullSatiety);
        }
        else {
            return new Buffalo(random.nextDouble(Settings.maxBuffaloWeight/2,Settings.maxBuffaloWeight),random.nextDouble(Settings.BuffaloFullSatiety)+1);
        }

    }


}

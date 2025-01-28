package entity.creature.animal;

import entity.Location;
import entity.creature.Creature;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantLock;


public abstract class Animal extends Creature {

    //Общие характеристики
    public  double currentWeight;
    public  double currentSatiety;
    public  double fullSatiety;
    public  double maxWeight;

    Location location;

    boolean isAlive = true;
    protected ReentrantLock lock = new ReentrantLock();
    protected ThreadLocalRandom random = ThreadLocalRandom.current();


    public Animal(double currentWeight,double currentSatiety){
        this.currentWeight = currentWeight;
        this.currentSatiety = currentSatiety;


    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public double getCurrentSatiety() {
        return currentSatiety;
    }

    public void setCurrentWeight(double currentWeight) {
       this.currentWeight = currentWeight;
    }

    public void setCurrentSatiety(double currentSatiety) {
        this.currentSatiety = currentSatiety;
    }

    public  double getMaxWeight() {
        return maxWeight;
    }

    public  double getFullSatiety() {
        return fullSatiety;
    }




    public String eat(Creature food){
        return null;
    }



    public void move(){
        //Пока не реализовано
    }


    public Animal reproduce(){

        return null;
    }



    public String die(Creature c) {
        return null;
    }

    public void selfDie(){


        location.removeAnimal(this);
    }



    public  void decreaseSatiety(){
        currentSatiety--;

    }
    public boolean isAlive(){

        return isAlive;
    }


}

package entity.creature.animal;

import entity.Location;
import entity.creature.Creature;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantLock;


public abstract class Animal extends Creature {

    //Общие характеристики
    double maxWeight;
    public static double currentWeight;
    public static double currentSatiety;
    int maxSpeed;
    protected static int FullSatiety;

    boolean isAlive = true;
    protected ReentrantLock lock = new ReentrantLock();
    protected ThreadLocalRandom random = ThreadLocalRandom.current();

    // Пул потоков для параллельного выполнения
    protected static final ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());


    public Animal(double currentWeight,double currentSatiety){
        this.currentWeight = currentWeight;
        this.currentSatiety = currentSatiety;
    }
    public synchronized void eat(Creature eater , Creature food,Creature[] creatures){

    }




    public abstract void eat(Creature food);

    public  void move(){

    }
        //Пока не реализовано

    public  Creature reproduce(){
        return null;
    }



    public void die(Creature c) {

    }


    public Creature[] removeCreature(Creature c ,Creature[] creatures){
        return null;
    } //Удаление животного из-за смерти


    public  void decreaseSatiety(){

    }
    public boolean isAlive(){
        return isAlive;
    }


    public void eat(Location location) {
    }
}

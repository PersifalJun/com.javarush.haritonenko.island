package entity.creature.animal;

import config.Settings;
import entity.Location;
import entity.creature.Creature;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantLock;


public abstract class Animal extends Creature implements Cloneable{

    //Общие характеристики
    protected double currentWeight;
    protected double currentSatiety;
    public double fullSatiety;
    public double maxWeight;
    protected Location currentLocation; // Текущая локация




    boolean isAlive = true;
    protected ReentrantLock lock = new ReentrantLock();
    protected ThreadLocalRandom random = ThreadLocalRandom.current();


    public Animal(double currentWeight,double currentSatiety){
        this.currentWeight = currentWeight;
        this.currentSatiety = currentSatiety;


    }
    // Абстрактный метод для получения скорости животного
    public abstract int getSpeed();

    // Абстрактный метод для получения вида животного
    public abstract String getSpecies();

    // Метод перемещения животного, который будет переопределяться в Predator и Herbivor
    public abstract void move(Location[][] locations, int x, int y);

    // Геттер и сеттер для текущей локации
    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location location) {
        this.currentLocation = location;
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



    public void eat(Creature food){

    }

    // Реализация клонирования животного
    @Override
    public Animal clone() {
        try {
            // Используем стандартный метод clone(), который создает поверхностную копию
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Клонирование не поддерживается для этого класса", e);
        }
    }

    // Метод для получения вероятности перемещения (можно изменить для разных типов животных)
    public int getMoveProbability() {
        // Это должен быть ваш механизм вычисления вероятности перемещения для конкретного животного
        return 30; // Пример: 30% вероятность перемещения
    }



    public Animal reproduce(){

        return null;
    }



    public String die() {
        return "умер";
    }


    public  void decreaseSatiety(){
        currentSatiety-=0;
        currentWeight-=0;

    }
    public boolean isAlive(){

        return isAlive;
    }


}

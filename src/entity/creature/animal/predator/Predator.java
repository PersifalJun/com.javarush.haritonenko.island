package entity.creature.animal.predator;

import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.animal.herbivor.Herbivor;




public class Predator extends Animal {

    public double maxWeight;
    boolean isAlive = true;
    Location location;


    public Predator(double currentWeight,double currentSatiety){
        super(currentWeight,currentSatiety);

    }



    @Override
    public void eat(Creature food) {
        if(food instanceof Herbivor){
            lock.lock();
            try {
                double foodWeight = ((Herbivor) food).currentWeight;
                this.currentSatiety = Math.min(fullSatiety, this.getCurrentWeight() + foodWeight * 0.5);
                this.currentWeight += foodWeight*0.1;

            }
            catch(Exception e ){
                e.printStackTrace();

            }
            lock.unlock();

        }


    }


    @Override
    public void move(){
        //Пока не реализовано + добавлю рандом перехода животных на новую локу
    }

    @Override
    public Predator reproduce() {    //Условия размножения прописать в самом изненном цикле
        try {
            // Динамически создаем объект того же класса, что и this
            Predator child = this.getClass().getDeclaredConstructor().newInstance();
            child.setCurrentWeight(this.getMaxWeight()/2);
            child.setCurrentSatiety(this.getFullSatiety()/2);
            return child;
        } catch (Exception e) {
            e.printStackTrace();
            return null;                                       // Если не удалось создать, возвращаем null
        }
    }
        /*if (currentSatiety >= FullSatiety * 0.5) {
            currentSatiety -= FullSatiety * 0.2;

        }
       */


    //Смерть жертвы
    @Override
    public String die(Creature c) {  //Условия смерти  прописать в самом жизненном цикле
        String dieResult ="";
        if (this.isAlive) {
            if ((currentWeight < maxWeight / 2 || currentSatiety <= 0 ) || (currentWeight > maxWeight && currentSatiety > fullSatiety)) {
                dieResult = " die " + " weight:" + currentWeight;
                this.isAlive = false;
            }
        }
        return dieResult;
    }


    @Override
    public void decreaseSatiety() {
        this.currentSatiety -= 0;
        this.currentWeight -= 0;
    }
}



package entity.creature.animal.herbivor;


import entity.creature.Eatable;




public class Mouse extends Herbivor implements Eatable {
    public static double maxWeight = 0.05;
    private final int maxSpeed = 1;
    public static double fullSatiety = 0.01;


    public Mouse(double currentWeight,double currentSatiety) {
        super(currentWeight,currentSatiety);
    }


    @Override
    public void beEaten() {
        //die();
    }
}

/*
    @Override
    public void eat(Creature mouse , Creature plant){
        if(currentWeight!=maxWeight && currentSatiety != fullSatiety){
            currentWeight += random.nextDouble(10)+1;
            fullSatiety += random.nextDouble(4)+1 ;
            die(plant);
        }
        else{
            die(mouse); //Умер от переедания
        }


    }
    public void move(){
        //Пока не реализовано
    }
    public void die(Creature c){
        if(isAlive){
            isAlive = false;
        }
        else{
            System.out.println("Животное мертво");

        }


    }
    @Override
    public void removeCreature(Creature c ,Creature[] creatures) {         //Тут важно убрать животное после смерти из массива , куда я добавил его благодароя PredatorFactory
        Mouse mouse = (Mouse) c;
        Mouse[] mice = (Mouse[]) creatures;
        if (mouse!= null && mice!= null){
            List<Mouse> mouseList= Arrays.asList(mice);
            mouseList.remove(mice[mice.length]);
            Mouse[] mouseArray = (Mouse[]) mouseList.toArray();
            mice =  mouseArray;

        }

    }

    public Creature reproduce(){
        return new Mouse(random.nextDouble(maxWeight)+1,random.nextDouble(fullSatiety)+1);

    }
    public void decreaseSatiety(){
        currentWeight--;
        currentSatiety--;
    }
    */

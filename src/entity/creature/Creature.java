package entity.creature;

import config.Settings;

public abstract class Creature {

    private Creature[] creatures;
    private Creature[] currentList;
    public void setCurrentList(Creature[] currentList){
        this.currentList = currentList;
    }
    public Creature[] getCurrentList(){
        return currentList;
    }
    public Creature[] getCreatures(){
        return creatures;
    }
    public void setCreatures(Creature[] creatures){
        this.creatures = creatures;
    }

    //Рост растений
    // void increaseQuantity(){ --quantity

}

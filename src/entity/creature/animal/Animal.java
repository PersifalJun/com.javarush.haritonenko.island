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
    private String species; // Вид животного
    private Location location; // Текущая локация животного



    boolean isAlive = true;
    protected ReentrantLock lock = new ReentrantLock();
    protected ThreadLocalRandom random = ThreadLocalRandom.current();


    public Animal(double currentWeight,double currentSatiety){
        this.currentWeight = currentWeight;
        this.currentSatiety = currentSatiety;


    }
    public void move() {
        // 50% вероятность того, что животное перейдет на другую локацию
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            // Получаем список соседних локаций (например, смежные клетки)
            Location newLocation = findNewLocation();

            // Если такая локация существует, проверяем условия
            if (newLocation != null) {
                // Получаем список животных на новой локации и их виды
                List<Animal> animalsOnNewLocation = newLocation.getAnimals();
                int speciesCount = 0;

                // Подсчитываем количество животных этого вида на новой локации
                for (Animal animal : animalsOnNewLocation) {
                    if (animal.getSpecies().equals(this.species)) {
                        speciesCount++;
                    }
                }

                // Проверяем, не превышает ли количество животных на локации ограничение
                if (newLocation.getCapacity() > animalsOnNewLocation.size() && speciesCount < newLocation.getMaxSpeciesCount(this.species)) {
                    // Удаляем животное из старой локации
                    this.location.removeAnimal(this);

                    // Создаем клон животного для новой локации
                    Animal clonedAnimal = this.clone();
                    clonedAnimal.setLocation(newLocation);

                    // Добавляем животное в новую локацию
                    newLocation.addAnimal(clonedAnimal);

                    // Логирование перемещения
                    System.out.println(this.species + " переместилось из локации [" + this.location.getCoordinates() + "] в локацию [" + newLocation.getCoordinates() + "]");
                } else {
                    // Логирование ошибки
                    System.out.println(this.species + " не может переместиться. На локации [" + newLocation.getCoordinates() + "] слишком много животных этого вида или локация переполнена.");
                }
            }
        } else {
            System.out.println(this.species + " не переместилось. Случай выбрал оставаться.");
        }
    }

    // Метод для поиска новой локации для перемещения (соседние клетки)
        private Location findNewLocation() {
        // Список соседей (например, случайный сосед по вертикали или горизонтали)
        int dx = ThreadLocalRandom.current().nextInt(0, Settings.columnsCount);
        int dy = ThreadLocalRandom.current().nextInt(0, Settings.rowsCount);

        // Возвращаем новую локацию (в данном примере просто случайно выбранную)
        Location newLocation = this.location.getAdjacentLocation(dx, dy); // Метод получения соседней локации
        if (newLocation == null) {
            System.out.println("Не удалось найти соседнюю локацию для перемещения.");
        }
        return newLocation;
    }

    // Дополнительные методы (getters, setters и т.д.)
    public String getSpecies() {
        return species;
    }
    // Сеттер для species
    public void setSpecies(String species) {
        this.species = species;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    // Метод клонирования животного (понадобится для создания копии)
    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Ошибка клонирования", e);
        }
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

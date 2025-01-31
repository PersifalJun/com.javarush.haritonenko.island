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
    private String species =""; // Вид животного
    private Location location; // Текущая локация животного
    private int speed;



    boolean isAlive = true;
    protected ReentrantLock lock = new ReentrantLock();
    protected ThreadLocalRandom random = ThreadLocalRandom.current();


    public Animal(double currentWeight,double currentSatiety){
        this.currentWeight = currentWeight;
        this.currentSatiety = currentSatiety;
        this.speed = getSpeedForSpecies(species);


    }
    public void move() {
        // 50% вероятность того, что животное переместится
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            // Ищем соседнюю локацию
            Location newLocation = findNewLocation();

            // Если такая локация существует, проверяем, можно ли туда переместиться
            if (newLocation != null) {
                // Получаем количество животных на новой локации
                List<Animal> animalsOnNewLocation = newLocation.getAnimals();
                int speciesCount = 0;

                // Подсчитываем количество животных того же вида
                for (Animal animal : animalsOnNewLocation) {
                    if (animal.getSpecies().equals(this.species)) {
                        speciesCount++;
                    }
                }

                // Проверяем, есть ли место на новой локации для перемещения
                if (newLocation.getCapacity() > animalsOnNewLocation.size() && speciesCount < newLocation.getMaxSpeciesCount(this.species)) {
                    // Убираем животное с текущей локации
                    this.location.removeAnimal(this);

                    // Устанавливаем новое местоположение
                    this.setLocation(newLocation);

                    // Добавляем животное на новую локацию
                    newLocation.addAnimal(this);

                    // Логируем перемещение
                    System.out.println(this.species + " переместилось из локации [" + this.location.getCoordinates() + "] в локацию [" + newLocation.getCoordinates() + "]");
                } else {
                    // Логируем ошибку, если локация переполнена
                    System.out.println(this.species + " не может переместиться. Локация переполнена или слишком много животных того же вида.");
                }
            }
        } else {
            // Если случай выбрал не перемещаться
            System.out.println(this.species + " не переместилось.");
        }
    }
    private Location findNewLocation() {
        // Генерируем случайное смещение для поиска соседней клетки
        int dx = ThreadLocalRandom.current().nextInt(-1, 2); // Сдвиг по оси X (-1, 0, 1)
        int dy = ThreadLocalRandom.current().nextInt(-1, 2); // Сдвиг по оси Y (-1, 0, 1)

        // Получаем новую локацию на основе текущей и смещения
        Location newLocation = this.location.getAdjacentLocation(dx, dy);

        // Проверяем, если такая локация существует
        if (newLocation == null) {
            System.out.println("Не удалось найти соседнюю локацию для перемещения.");
        }

        return newLocation;
    }







    // Метод, возвращающий скорость животного в зависимости от его вида
    private int getSpeedForSpecies(String species) {
        if (species == null) {
            System.out.println("Ошибка: вид животного не задан");
            return 0;
        }

        switch (species) {
            case "Wolf": return Settings.maxWolfSpeed;
            case "Fox": return Settings.maxFoxSpeed;
            case "Eagle": return Settings.maxEagleSpeed;
            case "Boa": return Settings.maxBoaSpeed;
            case "Bear": return Settings.maxBearSpeed;
            case "Sheep": return Settings.maxSheepSpeed;
            case "Rabbit": return Settings.maxRabbitSpeed;
            case "Mouse": return Settings.maxMouseSpeed;
            case "Horse": return Settings.maxHorseSpeed;
            case "Hog": return Settings.maxHogSpeed;
            case "Goat": return Settings.maxGoatSpeed;
            case "Duck": return Settings.maxDuckSpeed;
            case "Deer": return Settings.maxDeerSpeed;
            case "Caterpillar": return Settings.maxCaterpillarSpeed;
            case "Buffalo": return Settings.maxBuffaloSpeed;
            default: return 0; // Если не найден вид, то скорость 0
        }
    }


    public int getSpeed() {
        return this.speed;
    }



    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    // Метод клонирования животного
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

package entity.creature.animal.predator;


import config.Settings;
import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.animal.herbivor.*;
import java.util.List;
import repository.PredatorFactory;


public class Predator extends Animal {



    public Predator(double currentWeight,double currentSatiety){
        super(currentWeight,currentSatiety);

    }
    @Override
    public double getMaxWeight() {
        if (this instanceof Wolf) return Settings.maxWolfWeight;
        if (this instanceof Fox) return Settings.maxFoxWeight;
        if (this instanceof Eagle) return Settings.maxEagleWeight;
        if (this instanceof Boa) return Settings.maxBoaWeight;
        if (this instanceof Bear) return Settings.maxBearWeight;
        return 0;
    }
    @Override
    public double getFullSatiety() {
        if (this instanceof Wolf) return Settings.WolfFullSatiety;
        if (this instanceof Fox) return Settings.FoxFullSatiety;
        if (this instanceof Eagle) return Settings.EagleFullSatiety;
        if (this instanceof Boa) return Settings.BoaFullSatiety;
        if (this instanceof Bear) return Settings.BearFullSatiety;
        return 0;
    }


    @Override
    public void eat(Creature food) {
        if (food instanceof Herbivor) {
            lock.lock();
            try {
                // Проверка, не переел ли хищник
                if (this.isOverfed()) {
                    System.out.println(this.getClass().getSimpleName() + " уже переел и не может больше есть!");
                    return; // Выход из метода, если хищник переел
                }

                double foodWeight = ((Herbivor) food).getCurrentWeight();


                double satietyIncrease = foodWeight * 0.05;
                double weightIncrease = foodWeight * 0.1;

                // Увеличиваем насыщенность и вес
                this.currentSatiety += satietyIncrease;
                this.currentWeight += weightIncrease;

                System.out.println(this.getClass().getSimpleName() + " съел " + food.getClass().getSimpleName() +
                        "; новый вес: " + this.currentWeight +
                        "; новая насыщенность: " + this.currentSatiety);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public boolean isOverfed() {

        return this.currentSatiety >= getFullSatiety() || this.currentWeight >= getMaxWeight();
    }




    @Override
    public Predator reproduce() {
        // Создаём потомка через фабричный метод
        PredatorFactory predatorFactory = new PredatorFactory(0,0);

        // Используем getClass() для получения текущего типа хищника
        Predator child = predatorFactory.createPredator(this.getClass());

        // Устанавливаем вес и сытость детеныша
        child.setCurrentWeight(this.getMaxWeight() / 2);
        child.setCurrentSatiety(this.getFullSatiety() / 2);

        return child;
    }


    @Override
    public void decreaseSatiety() {
        double satietyLoss = this.getFullSatiety() * 0.3; // Теряется 30% от полного запаса сытости
        double weightLoss = this.getMaxWeight() * 0.3;   // Теряется 30% от максимального веса

        this.currentSatiety = Math.max(0, this.currentSatiety - satietyLoss);
        this.currentWeight = Math.max(this.getMaxWeight() * 0.5, this.currentWeight - weightLoss);

        System.out.println(this.getClass().getSimpleName() + " потерял сытость: " + satietyLoss +
                " | Потеря веса: " + weightLoss);
    }
    @Override
    public int getSpeed() {
        // Возвращаем скорость на основе конкретного вида животного
        if (this instanceof Wolf) return Settings.maxWolfSpeed;
        if (this instanceof Fox) return Settings.maxFoxSpeed;
        if (this instanceof Eagle) return Settings.maxEagleSpeed;
        if (this instanceof Boa) return Settings.maxBoaSpeed;
        if (this instanceof Bear) return Settings.maxBearSpeed;
        return 0; // Если вид не найден, возвращаем 0
    }

    @Override
    public String getSpecies() {
        return "Predator";
    }

    @Override
    public void move(Location[][] locations, int x, int y) {
        int moveProbability = getMoveProbability();

        // Генерация случайного числа для вероятности перемещения
        if (Math.random() * 100 > moveProbability) {
            return; // Если хищник не перемещается
        }

        List<Location> neighbors = currentLocation.getNeighboringLocations();

        for (Location neighbor : neighbors) {
            // Проверяем, что локация не переполнена и может принять животное
            if (neighbor.canAddAnimal(this)) {
                // Клонируем животное и добавляем в соседнюю локацию
                Animal clonedAnimal = this.clone();
                currentLocation.removeAnimal(this);
                currentLocation = neighbor;
                neighbor.addAnimal(clonedAnimal);  // Добавляем клонированное животное

                // Выводим информацию о перемещении
                System.out.println(this.getClass().getSimpleName() + " переместился в соседнюю локацию с шансом " +
                        moveProbability + "%.");
                break;
            }
        }
    }
    @Override
    public int getMoveProbability() {
        return getSpeed() * 10; // Скорость * 10, например, для скорости 3 вероятность 30%
    }
}



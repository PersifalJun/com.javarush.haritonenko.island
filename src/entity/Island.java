package entity;

import java.util.concurrent.ThreadLocalRandom;

public class Island {
    private int columnsCount;
    private int rowsCount;
    private Location[][] locations;

    // Конструктор для задания размеров острова
    public Island(int columnsCount, int rowsCount) {
        this.columnsCount = columnsCount;
        this.rowsCount = rowsCount;
        this.locations = new Location[columnsCount][rowsCount]; // Инициализация массива
    }

    // Метод для создания локаций
    public void createLocations() {
        for (int i = 0; i < columnsCount; i++) {
            for (int j = 0; j < rowsCount; j++) {
                locations[i][j] = new Location(i,j); // Инициализация каждой локации
            }
        }
    }

    // Получить массив локаций
    public Location[][] getLocations() {
        return locations;
    }
}
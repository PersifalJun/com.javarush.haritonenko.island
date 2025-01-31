package entity;


import config.Settings;

public class Island {
    private int columnsCount;
    private int rowsCount;
    private Location[][] locations;

    // Конструктор для задания размеров острова
    public Island(int columnsCount, int rowsCount) {
        this.columnsCount = columnsCount;
        this.rowsCount = rowsCount;
        this.locations = new Location[columnsCount][rowsCount];
    }

    // Метод для создания локаций
    public void createLocations() {
        for (int i = 0; i < columnsCount; i++) {
            for (int j = 0; j < rowsCount; j++) {
                locations[i][j] = new Location(i,j, Settings.capacity); // Инициализация каждой локации
            }
        }
    }


    public Location[][] getLocations() {
        return locations;
    }
}
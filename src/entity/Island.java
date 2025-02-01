package entity;


import config.Settings;

public class Island {
    private Location[][] locations; // Двумерный массив локаций

    // Конструктор для инициализации острова с количеством строк и столбцов
    public Island(int columnsCount, int rowsCount) {
        // Инициализация массива локаций
        this.locations = new Location[columnsCount][rowsCount];
    }

    // Метод для создания локаций и их инициализации
    public void createLocations() {
        for (int i = 0; i < Settings.columnsCount; i++) {
            for (int j = 0; j < Settings.rowsCount; j++) {
                locations[i][j] = new Location(i, j,this);  // Инициализация каждой локации
            }
        }
    }

    // Метод для получения всех локаций
    public Location[][] getLocations() {
        return locations;
    }

    // Метод для получения локации по индексу (если нужно)
    public Location getLocationAt(int x, int y) {
        if (x >= 0 && x < locations.length && y >= 0 && y < locations[0].length) {
            return locations[x][y];
        }
        return null;  // Если индексы выходят за пределы массива
    }
}
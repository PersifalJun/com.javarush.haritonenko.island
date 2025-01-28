package entity;

public class Island {


    private int columnsCount;
    private int rowsCount;


    public Island(int columnsCount,int rowsCount) {
        this.columnsCount = columnsCount;
        this.rowsCount = rowsCount;
    }

    Location[][] locations = new Location[columnsCount][rowsCount];

    public void createLocations(){

        for (int i = 0; i < columnsCount; i++) {
            for (int j = 0; j < rowsCount; j++) {
                locations[i][j] = new Location();

            }
        }
    }

    public Location[][] getLocations() {
        return locations;
    }
}

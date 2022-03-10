package task2;

public class Building {
    final int Rooms;
    private int numberOfBatrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(int rooms, int numberOfBatrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.Rooms = rooms;
        this.numberOfBatrooms = numberOfBatrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public int getRooms() {
        return Rooms;
    }

    public int getNumberOfBatrooms() {
        return numberOfBatrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}

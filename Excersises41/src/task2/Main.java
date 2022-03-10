package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(4,2,4,3);
        Room room2 = new Room(4,5,2,6);
        Room room3 = new Room(5,3,5,2);
        ArrayList<Room> allRooms = new ArrayList<Room>();
        allRooms.add(room1);
        allRooms.add(room2);
        allRooms.add(room3);

        Building building1 = new Building(7,2,3,true);



    }
}

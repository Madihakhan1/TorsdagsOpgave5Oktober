import java.util.ArrayList;

public class Building {

    //3.d
    int numberOfBathrooms;
    int numberOfFloors;
    boolean isOfficeBuilding;
    ArrayList<Room> rooms;

    //3.e
    public Building(int numberOfBathrooms, int numberOfFloors,boolean isOfficeBuilding) {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;

    }public int getRoomSize() {
        return rooms.size();
    }

}







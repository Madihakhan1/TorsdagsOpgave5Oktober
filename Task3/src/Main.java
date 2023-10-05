public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(8,7,3);
        Room room2 = new Room(4,7,3);
        Room room3 = new Room(8,7,3);

        //3.h
        Building building1 = new Building (2,4,false);
        building1.addRoom(room1);
        building1.addRoom(room2);
        building1.addRoom(room3);

        int rezult = countLampsInBuilding(building1);
        System.out.println(rezult);

        boolean result = isBuildingNormal(building1);
        System.out.println(result);

    }

    public static int countLampsInBuilding(Building building){

        int sum = 0;

        for (Room r: building.getRooms()){
            sum += r.getnumberOfLamps();
        }
        return sum;

    }public static boolean isBuildingNormal(Building building){
        boolean type = false;

       if(building.getNumberOfFloors() < building.getRoomSize()){
           return type = true;
       }
           return type;
       }
    }


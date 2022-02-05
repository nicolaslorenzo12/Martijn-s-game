import java.util.Scanner;
import java.util.ArrayList;

public class Room {

    private final Scanner scanner;
    private String direction;
    private final ArrayList<Room> rooms;

    public Room(String upRoom, String downRoom, String leftRoom, String rightRoom) {
        direction = "whatever";
        scanner = new Scanner(System.in);
        rooms = new ArrayList<>();
        Room lobby = new Room("nicoRoom", "martijnRoom", "patRoom", "gabyRoom");
        rooms.add(lobby);
        Room nicoRoom = new Room(null, "lobby", null, null);
        rooms.add(nicoRoom);
        Room martijnRoom = new Room("lobby", "markusRoom", "gertRoom", "stijnRoom");
        rooms.add(martijnRoom);
        Room patRoom = new Room(null, null, null, "lobby");
        rooms.add(patRoom);
        Room gabyRoom = new Room(null, null, "lobby", null);
        rooms.add(gabyRoom);
        Room markusRoom = new Room("martijnRoom", null, null, null);
        rooms.add(markusRoom);
        Room stijnRoom = new Room(null, null, "martijnRoom", null);
        rooms.add(stijnRoom);
        Room gertRoom = new Room(null, null, null, "martijnRoom");
        rooms.add(gertRoom);
    }


    public void movingToOtherRoom(String room, String direction){
        System.out.println("Currently you are in ");
        System.out.println("Please enter a direction, 'up', 'down', 'right, 'left' to move to another room. However, you will only move if it is possible. Otherwise, enter a new direction ");
    }

}




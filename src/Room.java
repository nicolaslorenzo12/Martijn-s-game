import java.util.Scanner;
import java.util.ArrayList;

public class Room {

    private final Scanner scanner;
    private String direction;
    private final ArrayList<Room> room;

    public Room(String upRoom, String downRoom, String leftRoom, String rightRoom) {
        direction = "whatever";
        scanner = new Scanner(System.in);
        room = new ArrayList<>();
        room.add(lobby);
        room.add(nicoRoom);
        room.add(martijnRoom);
        room.add(patRoom);
        room.add(gabyRoom);
        room.add(markusRoom);
        room.add(stijnRoom);
        room.add(gertRoom);
    }

    Room lobby = new Room("nicoRoom", "martijnRoom", "patRoom", "gabyRoom");
    Room nicoRoom = new Room(null, "lobby", null, null);
    Room martijnRoom = new Room("lobby", "markusRoom", "gertRoom", "stijnRoom");
    Room patRoom = new Room(null, null, null, "lobby");
    Room gabyRoom = new Room(null,null,"lobby",null);
    Room markusRoom = new Room("martijnRoom",null,null,null);
    Room stijnRoom = new Room(null,null,"martijnRoom",null);
    Room gertRoom = new Room(null,null,null,"martijnRoom");

    public void movingToOtherRoom(String direction){

        
    }
}




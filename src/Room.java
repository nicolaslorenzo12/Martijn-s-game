import java.util.Scanner;
import java.util.ArrayList;

public class Room {

    private final Scanner scanner;
    private String direction;
    private final ArrayList<Room> rooms;
    private Room upRoom;
    private Room downRoom;
    private Room leftRoom;
    private Room rightRoom;
    private String name;

    public Room() {
        direction = "whatever";
        scanner = new Scanner(System.in);
        rooms = new ArrayList<>();
        this.name = name;
        lobby.setRooms(nicoRoom,martijnRoom,gabyRoom,patRoom,"Lobby");
        nicoRoom.setRooms(null,lobby,null,null,"Nico's Room");
        martijnRoom.setRooms(lobby,markusRoom,gertRoom,stijnRoom,"Martijn's Room");
        gabyRoom.setRooms(null,null,null,lobby,"Gaby's Room");
        patRoom.setRooms(null,null,lobby,null,"Pat's Room");
        markusRoom.setRooms(martijnRoom,null,null,null,"Markus's Room");
        gertRoom.setRooms(null,null,null,martijnRoom,"Gert's Room");
        stijnRoom.setRooms(null,null,martijnRoom,null,"Stijn's Room");
        rooms.add(lobby);
        rooms.add(nicoRoom);
        rooms.add(martijnRoom);
        rooms.add(gabyRoom);
        rooms.add(patRoom);
        rooms.add(markusRoom);
        rooms.add(gertRoom);
        rooms.add(stijnRoom);
    }

    Room lobby = new Room();
    Room nicoRoom = new Room();
    Room martijnRoom = new Room();
    Room gabyRoom = new Room();
    Room patRoom = new Room();
    Room markusRoom = new Room();
    Room gertRoom = new Room();
    Room stijnRoom = new Room();

    public void setRooms(Room upRoom, Room downRoom, Room rightRoom, Room leftRoom, String name){
        this.upRoom = upRoom;
        this.downRoom = downRoom;
        this.rightRoom = rightRoom;
        this.leftRoom = leftRoom;
        this.name = name;
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }


}




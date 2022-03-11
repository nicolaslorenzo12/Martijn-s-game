import java.util.Scanner;

public class Player {

    private String name;
    private Room room;
    private Scanner scanner;


    public Player(String name, Room room){
        this.name = name;
        this.room = room;
        scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean moveToRoom(Room room, String direction){
        boolean validRoom = false;

        if(direction.equals("up") && room.getUpRoom() !=null){
            validRoom = true;
            room = room.getUpRoom();
        }
        else if(direction.equals("down") && room.getDownRoom() != null){
            validRoom = true;
            room = room.getDownRoom();
        }
        else if(direction.equals("right") && room.getRightRoom() != null){
            validRoom = true;
            room = room.getRightRoom();
        }
        else if(direction.equals("left") && room.getLeftRoom() !=  null){
            validRoom = true;
            room = room.getLeftRoom();
        }
        else{
            System.out.print("");
        }

        if(validRoom) {
            System.out.println("Now you are in " + room.getName());
        }

        setRoom(room);
        return validRoom;
    }
}

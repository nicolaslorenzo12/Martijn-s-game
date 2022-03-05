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

        if(direction.equals("up")){
            if(room.getUpRoom() != null){
                validRoom = true;
                room = room.getUpRoom();
                System.out.println("Now you are in " + room.getName());
            }
        }
        else if(direction.equals("down")){
            if(room.getDownRoom() != null){
                validRoom = true;
                room = room.getDownRoom();
                System.out.println("Now you are in " + room.getName());
            }
        }
        else if(direction.equals("right")){
            if(room.getRightRoom() != null){
                validRoom = true;
                room = room.getRightRoom();
                System.out.println("Now you are in " + room.getName());
            }
        }
        else if(direction.equals("left")){
            if(room.getLeftRoom() != null){
                validRoom = true;
                room = room.getLeftRoom();
                System.out.println("Now you are in " + room.getName());
            }
        }
        else{
            System.out.print("");
        }

        setRoom(room);
        return validRoom;
    }
}

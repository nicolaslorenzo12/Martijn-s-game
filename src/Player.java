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

    public boolean moveToRoom(Room room1, String direction){
        boolean validRoom = false;

        if(direction.equals("up")){
            if(room1.getUpRoom() != null){
                validRoom = true;
                room1 = room1.getUpRoom();
                setNewRoom(room1);
                System.out.println("Now you are in " + room1.getName());
            }
        }
        else if(direction.equals("down")){
            if(room1.getDownRoom() != null){
                validRoom = true;
                room1 = room1.getDownRoom();
                setNewRoom(room1);
                System.out.println("Now you are in " + room1.getName());
            }
        }
        else if(direction.equals("right")){
            if(room1.getRightRoom() != null){
                validRoom = true;
                room1 = room1.getRightRoom();
                setNewRoom(room1);
                System.out.println("Now you are in " + room1.getName());
            }
        }
        else if(direction.equals("left")){
            if(room1.getLeftRoom() != null){
                validRoom = true;
                room1 = room1.getLeftRoom();
                setNewRoom(room1);
                System.out.println("Now you are in " + room1.getName());
            }
        }
        else{
            System.out.print("");
        }

        return validRoom;
    }

    private void setNewRoom(Room room){
        this.room = room;
    }

    public Room getNewRoom(){
        return room;
    }
}

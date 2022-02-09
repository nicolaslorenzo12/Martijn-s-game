import java.util.Scanner;
import java.util.ArrayList;

public class Room {

    private final Scanner scanner;
    private Room upRoom;
    private Room downRoom;
    private Room leftRoom;
    private Room rightRoom;
    private String name;

    public Room() {
        scanner = new Scanner(System.in);
    }


    public Room getUpRoom() {
        return upRoom;
    }

    public void setUpRoom(Room upRoom) {
        this.upRoom = upRoom;
    }

    public Room getDownRoom() {
        return downRoom;
    }

    public void setDownRoom(Room downRoom) {
        this.downRoom = downRoom;
    }

    public Room getLeftRoom() {
        return leftRoom;
    }

    public void setLeftRoom(Room leftRoom) {
        this.leftRoom = leftRoom;
    }

    public Room getRightRoom() {
        return rightRoom;
    }

    public void setRightRoom(Room rightRoom) {
        this.rightRoom = rightRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}




import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Room {

    private Scanner scanner;
    private Room upRoom;
    private Room downRoom;
    private Room leftRoom;
    private Room rightRoom;
    private String name;
    private Weapon[] weapons;
    private Weapon weapon;
    private Random random;

    public Room() {
        weapon = new Sword();
        weapons = new Weapon[3];
        weapons[0] = weapon.getRandomWeapon();
        weapons[1] = weapon.getRandomWeapon();
        weapons[2] = weapon.getRandomWeapon();
        scanner = new Scanner(System.in);
        random = new Random();
        scanner = new Scanner(System.in);
        random = new Random();
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

    public Weapon getWeapon() {
        int x = random.nextInt(weapons.length);
        showWeapons();
        return weapons[x];
    }

    private void showWeapons(){
        for (Weapon value : weapons) {
            System.out.println(value + " is available");
        }
    }

}




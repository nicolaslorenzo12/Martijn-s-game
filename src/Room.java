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
    private ArrayList<Weapon> weapons;
    private Weapon[] randomWeapons;
    private Weapon weapon;
    private Random random;

    public Room() {

        weapons = new ArrayList<>();
        weapons.add(new Bat());
        weapons.add(new Bow());
        weapons.add(new Dagger());
        weapons.add(new Hammer());
        weapons.add(new ShotGun());
        weapons.add(new Sword());
        scanner = new Scanner(System.in);
        random = new Random();
        scanner = new Scanner(System.in);
        random = new Random();
        randomWeapons = new Weapon[3];
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

    //public Weapon getRandomWeapon(){
//
    //    int indexOfRandomWeapon = random.nextInt(weapons.size());
    //    return weapons.get(indexOfRandomWeapon);
    //}

    //public void showWeapons(){
    //    for (Weapon value : weapons) {
    //        System.out.println(value + " is available");
    //    }
    //}

    public void getRandomWeapons(){
        int indexArrayWeapon = 0;
        int indexRandomWeapon;

        while(indexArrayWeapon < 3){
            indexRandomWeapon = random.nextInt(weapons.size());
            randomWeapons[indexArrayWeapon] = weapons.get(indexRandomWeapon);
            indexArrayWeapon++;
        }
        for(Weapon weapon1 : randomWeapons){
            System.out.println(weapon1.getName());
        }
    }

}




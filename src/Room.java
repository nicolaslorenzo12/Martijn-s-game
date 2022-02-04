import java.util.Scanner;
import java.util.ArrayList;

public class Room {

    private final Scanner scanner;
    private String direction;
    private final ArrayList<String> room;

    public Room(){
        direction = "whatever";
        scanner = new Scanner(System.in);
        room = new ArrayList<>();
        room.add(0,"lobby");
        room.add(1,"nico's Room");
        room.add(2,"gaby's Room");
        room.add(3,"pat's Room");
        room.add(4,"martijn's Room");
        room.add(5,"gert's Room");
        room.add(6,"markus's Room");
        room.add(7,"stijn's Room");
    }

    public void welcomeToLobby(){

        System.out.println("Welcome to the lobby");
        direction = "whatever";

        while(!direction.equals("up") && !direction.equals("down") && !direction.equals("right") && !direction.equals("left")){
            System.out.print("Please type 'up' to go to nico's room, 'down' to go to martijn's room, 'right' to go to gaby's room, 'left' to go to pat's room. Be careful when you type: ");
            direction = scanner.nextLine();
        }

        switch (direction) {
            case "up" -> welcomeToNicoRoom();
            case "down" -> welcomeToMartijnRoom();
            case "right" -> welcomeToGabyRoom();
            default -> welcomeToPatRoom();
        }
    }

    public void welcomeToNicoRoom(){

        System.out.println("Welcome to nico's room");
        
        while(!direction.equals("down")){
            System.out.print("Please type 'down' to go to the lobby. Be careful when you type: ");
            direction = scanner.nextLine();
        }
        welcomeToLobby();

    }

    public void welcomeToMartijnRoom(){

        System.out.println("Welcome to martijn's room");
        direction = "whatever";

        while(!direction.equals("up") && !direction.equals("down") && !direction.equals("right") && !direction.equals("left")){
            System.out.print("Please type 'up' to go to the lobby,'down' to go to gert's room, 'right' to go to marku's room,'left' to go to stijn's room. Be careful when you type: ");
            direction = scanner.nextLine();
        }

        switch (direction) {
            case "up" -> welcomeToLobby();
            case "down" -> welcomeToGertRoom();
            case "right" -> welcomeToMarkusRoom();
            default -> welcomeToStijnRoom();
        }

    }

    public void welcomeToGabyRoom(){

        System.out.println("Welcome to gaby's room");

        while(!direction.equals("left")){
            System.out.print("Please type 'left' to go to the lobby. Be careful when you type: ");
            direction = scanner.nextLine();
        }
        welcomeToLobby();

    }

    public void welcomeToPatRoom(){

        System.out.println("Welcome to pat's room");

        while(!direction.equals("right")){
            System.out.print("Please type 'right' to go to the lobby. Be careful when you type: ");
            direction = scanner.nextLine();
        }
        welcomeToLobby();

    }

    public void welcomeToMarkusRoom(){

        System.out.println("Welcome to markus's room");

        while(!direction.equals("left")){
            System.out.print("Please type 'left' to go to martijn's room. Be careful when you type: ");
            direction = scanner.nextLine();
        }
        welcomeToMartijnRoom();
    }

    public void welcomeToStijnRoom(){

        System.out.println("Welcome to stijn's room");

        while(!direction.equals("right")){
            System.out.print("Please type 'right' to go to martijn's room. Be careful when you type: ");
            direction = scanner.nextLine();
        }
        welcomeToMartijnRoom();
    }

    public void welcomeToGertRoom(){

        System.out.println("Welcome to gert's room");

        while(!direction.equals("up")){
            System.out.print("Please type 'up' to go to martijn's room. Be careful when you type: ");
            direction = scanner.nextLine();
        }
        welcomeToMartijnRoom();
    }


}

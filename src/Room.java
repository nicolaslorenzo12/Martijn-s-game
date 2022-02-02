import java.util.Scanner;

public class Room {

    Scanner scanner;
     private String roomName;

    public Room(String roomName){
        this.roomName = roomName;
        scanner = new Scanner(System.in);
    }

    Room lobby = new Room("Lobby");
    Room upRoom = new Room("Nico'sRoom");
    Room downRoom = new Room("Martijn'sRoom");
    Room rightRoom = new Room("Gaby'sRoom");
    Room leftRoom = new Room("Pat'sRoom");

    public void welcomeToLobby(){
        System.out.println("Welcome to the lobby");
        boolean correctDirection = false;

        while(!correctDirection) {
            System.out.println("Please enter 'up' to go nico's room, 'down' to go to martijn's room, 'right' to go to gaby's room and 'left' to go to pat's room ");
            String answer = scanner.nextLine();
            if (answer.equals("up")) {
                correctDirection = true;
                welcomeToNicoRoom();
            } else if (answer.equals("down")) {
                correctDirection = true;
                welcomeToMartijnRoom();
            }
            else if(answer.equals("right")){
                correctDirection = true;
                welcomeToGabyRoom();
            }
            else if(answer.equals("left")){
                correctDirection = true;
                welcomeToPatRoom();
            }
            else{
                System.out.println("Not a valid direction");
            }
        }
    }

    public void welcomeToNicoRoom(){

    }

    public void welcomeToMartijnRoom(){

    }

    public void welcomeToGabyRoom(){

    }

    public void welcomeToPatRoom(){

    }
}

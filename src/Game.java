import java.util.Arrays;
import java.util.Scanner;

public class Game {


    private final Room lobby;
    private final Room martijnRoom;
    private final Room nicoRoom;
    private final Room patRoom;
    private final Room gabyRoom;
    private final Room gertRoom;
    private final Room stijnRoom;
    private final Room markusRoom;
    private final Player player;
    private final Scanner scanner;

    public Game() {

        lobby = new Room();
        martijnRoom = new Room();
        nicoRoom = new Room();
        patRoom = new Room();
        gabyRoom = new Room();
        gertRoom = new Room();
        stijnRoom = new Room();
        markusRoom = new Room();
        player = new Player("Nicolas",lobby);
        scanner = new Scanner(System.in);

        lobby.setName("lobby");
        lobby.setUpRoom(nicoRoom);
        lobby.setDownRoom(martijnRoom);
        lobby.setRightRoom(gabyRoom);
        lobby.setLeftRoom(patRoom);
        nicoRoom.setDownRoom(lobby);
        gabyRoom.setLeftRoom(lobby);
        patRoom.setRightRoom(lobby);
        martijnRoom.setUpRoom(lobby);
        martijnRoom.setDownRoom(markusRoom);
        martijnRoom.setRightRoom(gertRoom);
        martijnRoom.setLeftRoom(stijnRoom);
        markusRoom.setUpRoom(martijnRoom);
        gertRoom.setLeftRoom(martijnRoom);
        stijnRoom.setRightRoom(martijnRoom);
        nicoRoom.setName("Nico's Room");
        martijnRoom.setName("Martijn's Room");
        patRoom.setName("Paty's Room");
        gabyRoom.setName("Gaby's Room");
        gertRoom.setName("Gert's Room");
        stijnRoom.setName("Stijn's Room");
        markusRoom.setName("Markus's Room");
    }

    public static void main(String[] args) {

        Game game = new Game();
        System.out.print("Please enter your name: ");
        String playerName = game.scanner.nextLine();
        game.player.setName(playerName);
        System.out.println("Welcome " + game.player.getName() + ", let's play!" );
        game.selectDirection(game.lobby, game.player);
    }


    public void selectDirection(Room room, Player player){

        String selection = "whatever";
        int firstTime = 0;
        while(!selection.equals("exit")){
            if(firstTime < 1){
                System.out.println("Now you are in " + room.getName());
                firstTime++;
            }
            System.out.println("Please enter 'up' to go up, 'down' to go down, 'right' to go to the right or 'left' to go to the left");
            selection = scanner.nextLine();
            boolean validSelection = player.moveToRoom(room,selection);

            if(validSelection){
                room = player.getRoom();
            }
            else{
               if(selection.equals("exit")){
                   System.out.println("bye");
               }
               else if(!selection.equals("up") && !selection.equals("down") && !selection.equals("right") && !selection.equals("left")){
                   System.out.println("You did not enter a good direction, please enter up, down, right or left");
               }
               else{
                   System.out.println("There is not an available room in this direction");
               }
            }

        }

    }
}

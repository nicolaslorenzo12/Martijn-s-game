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

    public void movingAround(Room room){

        String selection = "whatever";

        while(!selection.equals("exit")){
            System.out.println("Please enter 'up' to go up, 'down' to go down, 'right' to go to the right or 'left' to go to the left");
            selection = scanner.nextLine();

            if(selection.equals("up") || selection.equals("down") || selection.equals("right") || selection.equals("left")){
                if(selection.equals("up")){
                    if(room.getUpRoom() == null){
                        System.out.println("You can not go up");
                    }
                    else{
                        room = room.getUpRoom();
                        System.out.println("You are in " + room.getName()) ;
                    }
                }
                else if(selection.equals("down")){

                    if(room.getDownRoom() == null){
                        System.out.println("You can not go down");
                    }
                    else{
                        room = room.getDownRoom();
                        System.out.println("You are in " + room.getName()) ;
                    }
                }
                else if(selection.equals("right")){
                    if(room.getRightRoom() == null){
                        System.out.println("You can not go to the right");
                    }
                    else{
                        room = room.getRightRoom();
                        System.out.println("You are in " + room.getName()) ;
                    }
                }
                else{
                    if(room.getLeftRoom() == null){
                        System.out.println("You can not go to the left");
                    }
                    else{
                        room = room.getLeftRoom();
                        System.out.println("You are in " + room.getName()) ;
                    }
                }
            }
            else if(!selection.equals("exit")){
                System.out.println("Type a valid option");
            }
            else{
                System.out.println("Bye");
            }
        }

    }
}

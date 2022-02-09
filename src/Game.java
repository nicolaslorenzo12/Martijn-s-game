public class Game {

    public Game() {

        Room lobby = new Room();
        Room martijnRoom = new Room();
        Room nicoRoom = new Room();
        Room patRoom = new Room();
        Room gabyRoom = new Room();
        Room gertRoom = new Room();
        Room stijnRoom = new Room();
        Room markusRoom = new Room();

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
    }

    public static void main(String[] args) {


    }
}

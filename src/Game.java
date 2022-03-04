public class Game {


    private final Room lobby;
    private final Room martijnRoom;
    private final Room nicoRoom;
    private final Room patRoom;
    private final Room gabyRoom;
    private final Room gertRoom;
    private final Room stijnRoom;
    private final Room markusRoom;
    private final Player nicolas;

    public Game() {

        lobby = new Room();
        martijnRoom = new Room();
        nicoRoom = new Room();
        patRoom = new Room();
        gabyRoom = new Room();
        gertRoom = new Room();
        stijnRoom = new Room();
        markusRoom = new Room();
        nicolas = new Player("Nicolas",lobby);

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
        game.nicolas.movingAround(game.lobby);
    }
}

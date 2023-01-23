package Week_3.Monsters;

public class MonstersApp {

    public static void main(String[] args) {

        Player filipe = new Player("Filipe", 3);
        Player susana = new Player("Susana", 3);
        MonstersGame game = new MonstersGame(filipe, susana);
        game.startGame();
    }
}

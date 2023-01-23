package Week_3.Monsters;

public class MonstersGame {

    private Player attacker;
    private Player defender;

    public MonstersGame(Player p1, Player p2) {
        this.attacker = p1;
        this.defender = p2;
        init();
    }

    public MonstersGame() {
        this.attacker = new Player("Player 1", 3);
        this.defender = new Player("Player 2", 3);
    }

    public void init() {
        this.attacker.monsters = this.createMonstersTeam(this.attacker.sizeOfMonsters());
        this.attacker.resetDeaths();
        this.defender.monsters = this.createMonstersTeam(this.defender.sizeOfMonsters());
        this.defender.resetDeaths();
    }

    public void startGame() {
        if ((int) (Math.random() * 2) == 1) {
            swapPlayers();
        }
        this.game();
    }

    public void game() {
        Player swapPlayer;
        while (!endGame()) {
            this.defender.playerSuffer(this.attacker.playerAttack());
//            defend.printMonsterDeck();
//            attack.printMonsterDeck();
            swapPlayers();
        }
    }

    public Monster[] createMonstersTeam(int size) {
        Monster[] monsters = new Monster[size];

        for (int i = 0; i < monsters.length; i++) {
            if (i % 5 == 0) {
                monsters[i] = new Monster_Werewolf("Werewolf");
            } else if (i % 2 == 0) {
                monsters[i] = new Monster_Mummy("Mummy");
            } else {
                monsters[i] = new Monster_Vampire("Vampire");
            }
        }

        return monsters;
    }

    private void swapPlayers() {
        Player swapPlayer = this.defender;
        this.defender = this.attacker;
        this.attacker = swapPlayer;
    }

    private boolean endGame() {
        if (this.attacker.getNumOfDeadMonsters() == this.attacker.monsters.length) {
            System.out.println(this.defender.name + "\twins the game and has " + (this.defender.monsters.length - this.defender.getNumOfDeadMonsters()) + " monsters left.");
            return true;
        }

        return false;
    }
}


package Week_3.Monsters;

public class Player {
    public Monster[] monsters;
    String name;
    private int numOfDeadMonsters;

    public Player(String name, int numOfInitialMonsters) {
        this.name = name;
        monsters = new Monster[numOfInitialMonsters];
    }

    public Monster[] getMonsters() {
        return monsters;
    }

    public int sizeOfMonsters() {
        return this.monsters.length;
    }


    private Monster pickMonster() {
        int index = RandomNumber.randomNumber(0, monsters.length);
        while (monsters[index].isDead()) {
            index = RandomNumber.randomNumber(0, monsters.length);
        }
        return monsters[index];
    }


    public int getNumOfDeadMonsters() {
        return numOfDeadMonsters;
    }

    public int playerAttack() {
        Monster monster = pickMonster();
        System.out.println("The monster " + monster.getMonsterName() + " has attacked!");
        return monster.attack();
    }

    public void playerSuffer(int damage) {
        Monster monster = pickMonster();
        System.out.println("The monster " + monster.getMonsterName() + " has been attacked!");
        System.out.println(monster.getMonsterName() + " has " + monster.getHealth() + " health.");
        monster.suffer(damage);

        if (monster.isDead()) {
            this.numOfDeadMonsters++;
        }
    }

    public void printMonsterDeck() {
        System.out.print(this.name + " ");
        for (Monster monster : this.monsters) {
            System.out.print(monster + " ");
        }
    }

    public void resetDeaths() {
        this.numOfDeadMonsters = 0;
    }
}

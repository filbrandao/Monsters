package Week_3.Monsters;

public class Monster_Vampire extends Monster {

    private boolean debug_mode;

    public Monster_Vampire(String monsterName) {
        super(monsterName);
    }

    public Monster_Vampire(String monsterName, boolean debug_mode) {
        super(monsterName);
        this.debug_mode = debug_mode;
    }

    public int attack() {
        if (!isDead()) {
            int randomChance = RandomNumber.randomNumber(0, 100);
            if (randomChance <= 20) {
                bite();
                if (debug_mode)
                    System.out.println("I feel great! My health was increased and is now " + this.health);
                return super.attack();
            }
            return super.attack();
        }
        return 0;
    }

    public void bite() {
        System.out.println("I'll bite you and take your blood!");
        if (this.health == 100) {
            return;
        }
        this.health += 10;
    }
}

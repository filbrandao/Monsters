package Week_3.Monsters;

public abstract class Monster {
    public int health;
    private int attackDamage;
    private boolean isDead;
    private String monsterName;

    public Monster(String monsterName) {
        this.attackDamage = 20;
        this.health = 100;
        this.monsterName = monsterName;
        this.isDead = false;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int getHealth() {
        return health;
    }

    public void takeHealth(int health) {
        this.health -= health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int attack() {
        if (!isDead) {
            return this.attackDamage;
        }
        return 0;
    }

    public void suffer(int attackDamage) {
        this.health -= attackDamage;
        if (this.health <= 0) {
            this.health = 0;
            this.isDead = true;
            System.out.println("I'm done, I can't fight anymore! RIP");
        }
    }

    public boolean isDead() {
        return this.isDead;
    }

    @Override
    public String toString() {
        return this.monsterName + "{" +
                "health=" + health +
                '}';
    }
}

package Week_3.Monsters;

public class Monster_Mummy extends Monster {
    private int attacksNumber = 0;

    public Monster_Mummy(String monsterName) {
        super(monsterName);
    }

    @Override
    public int attack() {
        if (attacksNumber == 3) {
            takeHealth(15);
            System.out.println("Oh no, I'm unable to attack now! Must re-gain attacking levels!");
            return attacksNumber = 0;
        }
        attacksNumber++;
        return super.attack();
    }
}

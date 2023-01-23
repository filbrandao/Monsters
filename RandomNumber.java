package Week_3.Monsters;

public class RandomNumber {

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * max + min);
    }

    public static int getRandom(int[] array) {
        int rnd = (int) (Math.random() * array.length);
        return array[rnd];
    }
}

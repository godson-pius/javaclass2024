package bankproject;

import java.util.Random;

public class Helper {
    public void check(int arg) {}
    static public int generateNum() {
        Random rand = new Random();
        return Math.abs(+rand.nextInt(1000000000)*1000);
    }
}

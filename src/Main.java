import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            new MainThread(i, new BreakThread(), rand.nextInt(1,5), rand.nextInt(1,10)).start();
        }
    }
}
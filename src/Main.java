
public class Main {
    public static void main(String[] args) {

        new MainThread(1, new BreakThread(), 1, 3).start();
        new MainThread(2, new BreakThread(), 2, 10).start();
        new MainThread(3, new BreakThread(), 3, 6).start();
        new MainThread(4, new BreakThread(), 8, 1).start();
        new MainThread(5, new BreakThread(), 2, 9).start();
        new MainThread(6, new BreakThread(), 1, 3).start();

    }
}
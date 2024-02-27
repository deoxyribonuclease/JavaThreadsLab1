import java.util.concurrent.TimeUnit;

class MainThread extends Thread {
    private final int id;
    private final BreakThread breakThread;
    private final int step;
    private final int workingTime;



    public MainThread(int id, BreakThread breakThread, int step, int workingTime) {
        this.id = id;
        this.breakThread = breakThread;
        this.step = step;
        this.breakThread.setTime(workingTime);
        this.workingTime = workingTime;
    }

    @Override
    public void run() {
        long sum = 0;
        long elementsCount = 0;

        new Thread(breakThread).start();
        while (!breakThread.isCanBreak()) {
            sum += step;
            elementsCount++;
        }

        System.out.println("Thread " + id + ": Sum = " + sum + ", Elements Count = " + elementsCount + " Seconds: " + workingTime);
    }
}

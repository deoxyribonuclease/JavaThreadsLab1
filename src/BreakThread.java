import java.util.concurrent.TimeUnit;
class BreakThread implements Runnable {
    private volatile boolean canBreak = false;
    private volatile int time = 0;

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        canBreak = true;
    }

    public void setTime(int time) {
       this.time = time;
    }

    public boolean isCanBreak() {
        return canBreak;
    }
}

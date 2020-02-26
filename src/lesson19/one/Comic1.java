package lesson19.one;

public class Comic1 extends Thread {

    private boolean alive = true;

    @Override
    public void run() {
        int count = 0;
        while (alive) {
            for (int i = 0; i < 5; i++) {
                System.out.println("йоу" + i);
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.micro) {
                Monitors.micro.notify();
            }
            synchronized (Monitors.micro) {
                try {
                    Monitors.micro.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            if (count > 2) {
                alive = false;
            }
        }
    }
}

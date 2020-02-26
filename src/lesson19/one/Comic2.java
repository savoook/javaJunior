package lesson19.one;

public class Comic2 extends Thread {
    @Override
    public void run() {
        while (true){
            synchronized (Monitors.micro) {
                try {
                    Monitors.micro.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("салам" + i);
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.micro) {
                Monitors.micro.notify();
            }
        }
    }
}

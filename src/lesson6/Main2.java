package lesson6;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int dni = 0; dni < 366; dni++) {
            for (int chasy = 0; chasy < 25; chasy++) {
                for (int min = 0; min < 61; min++) {
                    for (int sec = 0; sec < 60; sec++) {
                        System.out.printf("От старта прошло: %d дня, %d часа, %d минут, %d секунд", dni, chasy, min, sec);
                        System.out.println();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        System.out.println("End");
    }
}

package lesson18;

import lesson19.PrintNumber;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("первый поток начал работу");
        PrintNumber printNumber=new PrintNumber();
        printNumber.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("первый поток закончил работу");
    }
}

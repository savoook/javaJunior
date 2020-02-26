package lesson19.one;

public class Сompere {
    public static void main(String[] args) {
        System.out.println("Пошумим, блин");
        Comic1 comic1 = new Comic1();
        comic1.start();
        Comic2 comic2 = new Comic2();
        comic2.setDaemon(true);
        comic2.start();
        while (comic1.isAlive()){}
        System.out.println("раунд, емана");
    }
}

package lesson7;

public class Main {
    public static void main(String[] args) {
        Phone meizu = new Phone();
        Phone nokia = new Phone();
        //meizu.color = "blue";
        //nokia.battery = 5000;
        meizu.setBattery(4000);
        meizu.setColor("yello");
        meizu.setName("one");
        meizu.setDiagonal(5.7);
        nokia.setBattery(500);
        nokia.setColor("blue");
        nokia.setName("one+");
        nokia.setDiagonal(8.6);
        meizu.printInfo();
        nokia.printInfo();
    }
}

package lesson9.practica;

public class Main {
    public static void main(String[] args) {
        Qivi qivi = new Qivi();
        Apple apple = new Apple();
        Fruit fruit = new Fruit();
        System.out.println(qivi);
        System.out.println(apple);

        Fruit[] fruits = new Fruit[2];
        fruits[0] = qivi;
        fruits[1] = apple;
        //fruits[0].getName()
    }
}

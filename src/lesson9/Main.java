package lesson9;

public class Main {
    public static void main(String[] args) {
        Leon leon1 = new Leon();
        leon1.setName("Вася");
        Leon leon2 = new Leon();
        leon2.setName("Вася");

        System.out.println(leon1.equals(leon2));
        System.out.println(leon1);

        leon1.voice();
        Animal animal = new Animal();
        animal.voice();
    }
}

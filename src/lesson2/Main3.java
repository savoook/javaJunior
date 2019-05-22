package lesson2;

public class Main3 {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        int c = 6;
        if (a == b && b == c) {
            System.out.println("равносторонний треугольник");
        } else if (a == b || a == c || b == c) {
            System.out.println("равнобедренный треугольник");
        }
        if (a != b && a != c && b != c) {
            System.out.println("разносторонний треугольник");
        }
    }
}

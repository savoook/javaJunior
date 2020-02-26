package lesson13_map;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = getNumber(scanner);
        int num1 = getNumber(scanner, 3);
        System.out.println(num1);
    }

    private static int getNumber(Scanner scanner) {
        int number;
        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Введите еще раз!");
            return getNumber(scanner);
        }
        return number;
    }

    private static int getNumber(Scanner scanner, int a) {
        int number;
        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Введите еще раз!");
            return getNumber(scanner);
        }
        return number;
    }
}


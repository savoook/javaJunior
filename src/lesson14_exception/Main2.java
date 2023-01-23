package lesson14_exception;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        String inputNum = scanner.nextLine();
        int num=0;
        try {
             num = Integer.parseInt(inputNum);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("не верно");
        }
        catch (Exception e) {
            //e.printStackTrace();
            System.out.println("не верно");
        }
        finally {
            System.out.println("GFD");
        }

        System.out.println(num);
    }
}

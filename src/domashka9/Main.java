package domashka9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.setStorona1(1);
        triangle1.setStorona2(1);
        triangle1.setStorona3(3);
        Triangle triangle2 = new Triangle();
        triangle2.setStorona1(2);
        triangle2.setStorona2(4);
        triangle2.setStorona3(7);
        Triangle triangle3 = new Triangle();
        triangle3.setStorona1(3);
        triangle3.setStorona2(3);
        triangle3.setStorona3(9);
        Rhombus rhombus1 = new Rhombus();
        rhombus1.setOsnovanie(5);
        rhombus1.setVisota(4);
        Rhombus rhombus2 = new Rhombus();
        rhombus2.setOsnovanie(6);
        rhombus2.setVisota(3);
        Rhombus rhombus3 = new Rhombus();
        rhombus3.setOsnovanie(8);
        rhombus3.setVisota(3);
        Figure[] figures = new Figure[6];
        figures[0] = triangle1;
        figures[1] = triangle2;
        figures[2] = triangle3;
        figures[3] = rhombus1;
        figures[4] = rhombus2;
        figures[5] = rhombus3;
        Scanner in = new Scanner(System.in);
        LOOP:
        while (true) {
            System.out.println("Привет! Что необходимо посчитать: периметр или площадь?");
            String answer = in.nextLine();
            if (answer.equals("периметр")) {
                for (Figure f : figures) {
                    f.printPerimetr();
                }
                break LOOP;
            } else if (answer.equals("площадь")) {
                for (Figure f : figures) {
                    f.printPloshad();
                }
                break LOOP;
            } else {
                System.out.println("некорректный ответ");
            }
        }
    }
}

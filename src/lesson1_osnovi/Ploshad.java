package lesson1_osnovi;

public class Ploshad {
    public static void main(String[] args) {
        double a=2;
        double b=3;
        double c=4;
        double perimetr = a+b+c;
        double ploshad=Math.sqrt(perimetr*(perimetr-a)*(perimetr-b)*(perimetr-c));
        System.out.println(ploshad);
    }
}

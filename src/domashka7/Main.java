package domashka7;

public class Main {
    public static void main(String[] args) {
        Priamougolnik rectangle1 = new Priamougolnik();
        rectangle1.setDlina(6);
        rectangle1.setShirina(4);
        double ratio = rectangle1.getDlina() / rectangle1.getShirina();
        rectangle1.perimetr();
        rectangle1.ploshad();
        rectangle1.printInfo();
        System.out.println();
        System.out.print(ratio);
        System.out.println();
        Priamougolnik rectangle2 = new Priamougolnik();
        rectangle1.setDlina(8);
        rectangle1.setShirina(2);
        double ratio1 = rectangle1.getDlina() / rectangle1.getShirina();
        rectangle1.perimetr();
        rectangle1.ploshad();
        rectangle1.printInfo();
        System.out.println();
        System.out.print(ratio1);
        System.out.println();

        Krug circle1 = new Krug();
        circle1.setRadius(6);
        double diametr = 2 * circle1.getRadius();
        circle1.dlinaKruga();
        circle1.ploshad();
        circle1.printInfo();
        System.out.println();
        System.out.print(diametr);
        System.out.println();
        Krug circle2 = new Krug();
        circle2.setRadius(2);
        double diametr1 = 2 * circle2.getRadius();
        circle2.dlinaKruga();
        circle2.ploshad();
        circle2.printInfo();
        System.out.println();
        System.out.print(diametr1);
        System.out.println();

        Kvadrat square1 = new Kvadrat();
        square1.setStorona(3);
        double polovinaStorony = square1.getStorona() / 2;
        square1.perimetr();
        square1.ploshad();
        square1.printInfo();
        System.out.println();
        System.out.print(polovinaStorony);
        System.out.println();
        Kvadrat square2 = new Kvadrat();
        square2.setStorona(2);
        double polovinaStorony1 = square2.getStorona() / 2;
        square2.perimetr();
        square2.ploshad();
        square2.printInfo();
        System.out.println();
        System.out.print(polovinaStorony1);
        System.out.println();

        Treugolnik triangle1 = new Treugolnik();
        triangle1.setStoronaA(1);
        triangle1.setStoronaB(2);
        triangle1.setStoronaC(3);
        double proizvedenieStoron = triangle1.getStoronaA() * triangle1.getStoronaB() * triangle1.getStoronaC();
        triangle1.perimetr();
        triangle1.ploshad();
        triangle1.printInfo();
        System.out.println();
        System.out.print(proizvedenieStoron);
        System.out.println();
        Treugolnik triangle2 = new Treugolnik();
        triangle2.setStoronaA(1);
        triangle2.setStoronaB(3);
        triangle2.setStoronaC(4);
        double proizvedenieStoron1 = triangle2.getStoronaA() * triangle2.getStoronaB() * triangle2.getStoronaC();
        triangle2.perimetr();
        triangle2.ploshad();
        triangle2.printInfo();
        System.out.println();
        System.out.print(proizvedenieStoron1);
        System.out.println();
    }
}

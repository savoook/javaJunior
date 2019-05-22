package domashka7;

public class Kvadrat {
    private double storona;

    public void setStorona(double newStorona) {
        this.storona = newStorona;
    }

    public double getStorona() {
        return storona;
    }

    public double perimetr() {
        return 4 * storona;
    }

    public double ploshad() {
        return storona * storona;
    }
    public void printInfo(){
        System.out.printf("Сторона-%s, Площадь-%s, Периметр-%s", storona, ploshad(), perimetr());
    }
}

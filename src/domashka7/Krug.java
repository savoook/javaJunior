package domashka7;

public class Krug {
    private double radius;

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public double dlinaKruga() {
        double П=3.14;
        return 2*П*radius;
    }

    public double ploshad() {
        double П=3.14;
        return (Math.pow(radius,2))*П;
    }

    public void printInfo() {
        System.out.printf("Радиус-%s, Длина окружности-%s, Площадь круга-%s", radius, dlinaKruga(), ploshad());
    }
}

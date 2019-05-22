package domashka7;

public class Priamougolnik {
    private double dlina;
    private double shirina;

    public void setDlina(double newDlina) {
        this.dlina = newDlina;
    }

    public void setShirina(double newShirina) {
        this.shirina = newShirina;
    }

    public double getDlina() {
        return dlina;
    }

    public double getShirina() {
        return shirina;
    }

    public double perimetr() {
        return 2*dlina + 2*shirina;
    }

    public double ploshad() {
        return dlina * shirina;
    }

    public void printInfo() {
        System.out.printf("Длина-%s, Ширмна-%s, Площадь-%s, Периметр-%s", dlina, shirina, ploshad(), perimetr());
    }
}

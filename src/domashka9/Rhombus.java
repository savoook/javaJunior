package domashka9;

public class Rhombus extends Figure {
    private int osnovanie;
    private int visota;

    public int getOsnovanie() {
        return osnovanie;
    }

    public void setOsnovanie(int osnovanie) {
        this.osnovanie = osnovanie;
    }

    public int getVisota() {
        return visota;
    }

    public void setVisota(int visota) {
        this.visota = visota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rhombus rhombus = (Rhombus) o;

        if (osnovanie != rhombus.osnovanie) return false;
        return visota == rhombus.visota;
    }

    @Override
    public int hashCode() {
        int result = osnovanie;
        result = 31 * result + visota;
        return result;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "osnovanie=" + osnovanie +
                ", visota=" + visota +
                '}';
    }

    @Override
    public void printPerimetr() {
        System.out.println(4 * osnovanie);
    }

    @Override
    public void printPloshad() {
        System.out.println(visota * osnovanie);
    }
}

package domashka9;

public class Triangle extends Figure {
    private int storona1;
    private int storona2;
    private int storona3;

    public int getStorona1() {
        return storona1;
    }

    public void setStorona1(int storona1) {
        this.storona1 = storona1;
    }

    public int getStorona2() {
        return storona2;
    }

    public void setStorona2(int storona2) {
        this.storona2 = storona2;
    }

    public int getStorona3() {
        return storona3;
    }

    public void setStorona3(int storona3) {
        this.storona3 = storona3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (storona1 != triangle.storona1) return false;
        if (storona2 != triangle.storona2) return false;
        return storona3 == triangle.storona3;
    }

    @Override
    public int hashCode() {
        int result = storona1;
        result = 31 * result + storona2;
        result = 31 * result + storona3;
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "storona1=" + storona1 +
                ", storona2=" + storona2 +
                ", storona3=" + storona3 +
                '}';
    }

    @Override
    public void printPerimetr() {
        System.out.println(storona1 + storona2 + storona3);
    }

    @Override
    public void printPloshad() {
        System.out.println(Math.sqrt((storona1 + storona2 + storona3) * (storona2 + storona3) * (storona1 + storona3) * (storona1 + storona2)));
    }
}

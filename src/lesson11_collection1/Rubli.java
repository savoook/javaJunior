package lesson11_collection1;

import java.util.Objects;

public class Rubli implements Comparable<Rubli> {
    private int nominal;
    private int year;

    public Rubli() {
    }

    public Rubli(int nominal, int year) {
        this.nominal = nominal;
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rubli rubli = (Rubli) o;
        return nominal == rubli.nominal &&
                year == rubli.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, year);
    }

    @Override
    public String toString() {
        return "Rubli{" +
                "nominal=" + nominal +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Rubli o) {
        if (this.nominal != o.nominal) {
            return this.nominal - o.nominal;
        }
        return this.year - o.year;
    }
}

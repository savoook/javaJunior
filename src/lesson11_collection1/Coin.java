package lesson11_collection1;

public class Coin implements Comparable<Coin> {
    private int nominal;
    private int diametr;
    private int year;

    public Coin() {

    }

    public Coin(int nominal, int diametr, int year) {
        this.nominal = nominal;
        this.diametr = diametr;
        this.year = year;
    }


    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
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

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (diametr != coin.diametr) return false;
        return year == coin.year;
    }

    @Override
    public int hashCode() {
        int result = nominal;
        result = 31 * result + diametr;
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", diametr=" + diametr +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        int nom1 = this.nominal;
        int nom2 = o.nominal;
        if (nom1 != nom2) {
            return nom2 - nom1;
        }
        int year1 = this.year;
        int year2 = o.year;
        if (year1 != year2) {
            return year2 - year1;
        }
        return -this.diametr + o.diametr;
    }

}



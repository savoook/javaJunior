package lesson7;

public class DrobnoeChislo {
    private int chislitel;
    private int znamenatel;

    public void setChislitel(int chislitel) {
        this.chislitel = chislitel;
    }

    public void setZnamenatel(int znamenatel) {
        if (znamenatel == 0) {
            System.out.println("Знаменатель не может быть 0");
        } else {
            this.znamenatel = znamenatel;
        }
    }

        public int getZnamenatel () {
            return znamenatel;
        }

        public int getChislitel () {
            return chislitel;
        }
        public void printInfo () {
            int zeloe = chislitel / znamenatel;
            int ostatok = chislitel % znamenatel;
            System.out.printf("%d %d/%d", zeloe, ostatok, znamenatel);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrobnoeChislo that = (DrobnoeChislo) o;

        if (chislitel != that.chislitel) return false;
        return znamenatel == that.znamenatel;
    }

    @Override
    public int hashCode() {
        int result = chislitel;
        result = 31 * result + znamenatel;
        return result;
    }
}

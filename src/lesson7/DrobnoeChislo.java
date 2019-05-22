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
    }

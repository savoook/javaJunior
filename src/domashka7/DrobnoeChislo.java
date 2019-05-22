package domashka7;

public class DrobnoeChislo {
    private int chislitel;
    private int znamenatel;

    public void setChislitel(int newChislitel) {
        this.chislitel = newChislitel;
    }

    public void setZnamenatel(int newZnamenatel) {
        this.znamenatel = newZnamenatel;
    }

    public int getChislitel() {
        return chislitel;
    }

    public int getZnamenatel() {
        return znamenatel;
    }

    public void printInfo() {
        System.out.printf("%d/%d", chislitel, znamenatel);
    }
}

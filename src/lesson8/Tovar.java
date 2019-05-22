package lesson8;

public class Tovar {
    private int idTovara;
    private int fixprice;
    private int discount;
    private String type;
    private String nameTovar;
    private String nameColor;
    private String colorId;
    private boolean avalieble;
    private Charakteristika[] charakteristikas = new Charakteristika[20];
    private Otziv[] otzivs = new Otziv[1000];

    public int getIdTovara() {
        return idTovara;
    }

    public void setIdTovara(int idTovara) {
        this.idTovara = idTovara;
    }

    public int getFixprice() {
        return fixprice;
    }

    public void setFixprice(int fixprice) {
        this.fixprice = fixprice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameTovar() {
        return nameTovar;
    }

    public void setNameTovar(String nameTovar) {
        this.nameTovar = nameTovar;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public boolean isAvalieble() {
        return avalieble;
    }

    public void setAvalieble(boolean avalieble) {
        this.avalieble = avalieble;
    }

    public Charakteristika[] getCharakteristikas() {
        return charakteristikas;
    }

    public void setCharakteristikas(Charakteristika[] charakteristikas) {
        this.charakteristikas = charakteristikas;
    }

    public Otziv[] getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(Otziv[] otzivs) {
        this.otzivs = otzivs;
    }

    public void addCharakteristika(Charakteristika charakteristika) {
        for (int i = 0; i < charakteristikas.length; i++) {
            if (charakteristikas[i] == null) {
                charakteristikas[i] = charakteristika;
                return;
            }
        }
    }

    public void addOtziv(Otziv otziv) {
        for (int i = 0; i < otzivs.length; i++) {
            if (otzivs[i] == null) {
                otzivs[i] = otziv;
                return;
            }
        }
    }

    public void printInfo() {
        System.out.printf("Товар: имя-%s, цена-%d скидка-%d, тип-%s", nameTovar, fixprice, discount, type);
        for (Charakteristika h : charakteristikas) {
            if (h != null) {
                System.out.println();
                System.out.print(h.getKey() + ":" + h.getValue());
            }
        }
        for (Otziv o : otzivs) {
            if (o != null) {
                System.out.println();
                System.out.print(o.getNameClient() + ":" + o.getReiting());
            }
        }
    }
}

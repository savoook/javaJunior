package lesson7;

public class Main1 {
    public static void main(String[] args) {
        DrobnoeChislo chislo1=new DrobnoeChislo();
        DrobnoeChislo chislo2=new DrobnoeChislo();

        chislo1.setChislitel(2);
        chislo1.setZnamenatel(5);

        chislo2.setChislitel(7);
        chislo2.setZnamenatel(4);

        CalkDrobey calculator=new CalkDrobey();
        DrobnoeChislo result=calculator.summa(chislo1,chislo2);
        result.printInfo();
    }
}

package domashka7;

public class Main1 {
    public static void main(String[] args) {
        DrobnoeChislo chislo = new DrobnoeChislo();
        chislo.setChislitel(86);
        chislo.setZnamenatel(128);
        SokrashenieDrobey calculator = new SokrashenieDrobey();
        DrobnoeChislo result = calculator.sokr(chislo);
        result.printInfo();
    }
}

package domashka7;

public class SokrashenieDrobey {
    public DrobnoeChislo sokr(DrobnoeChislo chislo) {
        DrobnoeChislo result = new DrobnoeChislo();
        result.setChislitel(chislo.getChislitel());
        result.setZnamenatel(chislo.getZnamenatel());
        for (int i = 2; i <= chislo.getZnamenatel(); i++) {
            if (chislo.getChislitel() % i == 0 && chislo.getZnamenatel() % i == 0) {
                result.setChislitel(chislo.getChislitel() / i);
                result.setZnamenatel(chislo.getZnamenatel() / i);
            }
        }
        return result;
    }
}
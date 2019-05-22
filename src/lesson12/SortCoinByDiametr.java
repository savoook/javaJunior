package lesson12;

import lesson11.Coin;

import java.util.Comparator;

public class SortCoinByDiametr implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {

        if (o1.getNominal() != o2.getNominal()) {
            return o2.getNominal() - o1.getNominal();
        }
        if (o1.getDiametr() != o2.getDiametr()) {
            return o2.getDiametr() - o1.getDiametr();
        }
        return o2.getYear() - o1.getYear();
    }
}




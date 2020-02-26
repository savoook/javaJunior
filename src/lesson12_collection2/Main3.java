package lesson12_collection2;

import lesson11_collection1.Coin;

import java.util.Comparator;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 2, 1900);
        Coin coin2 = new Coin(5, 2, 1910);
        Coin coin3 = new Coin(1, 2, 1930);
        Coin coin4 = new Coin(6, 3, 1950);
        Coin coin5 = new Coin(7, 2, 1940);
        TreeSet<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
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
        });
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        for (Coin c : coins) {
            System.out.println(c);
        }
    }
}
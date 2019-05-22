package lesson12;

import lesson11.Coin;

import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 2, 1900);
        Coin coin2 = new Coin(5, 2, 1900);
        Coin coin3 = new Coin(1, 2, 1930);
        Coin coin4 = new Coin(6, 3, 1950);
        Coin coin5 = new Coin(7, 2, 1940);
        TreeSet<Coin> coins = new TreeSet<>(new SortCoinByDiametr());
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        for (Coin c:coins){
            System.out.println(c);
        }
    }
}

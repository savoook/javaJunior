package lesson11;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {


        Coin coin1 = new Coin(5, 2, 1900);
        Coin coin2 = new Coin(5, 2, 1900);
        Coin coin3 = new Coin(7, 3, 1950);
        Coin coin4 = new Coin(5, 5, 1930);
        Coin coin5 = new Coin(5, 6, 1920);

        HashSet<Coin> coins = new HashSet<>();
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

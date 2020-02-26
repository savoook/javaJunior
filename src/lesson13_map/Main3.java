package lesson13_map;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 10);
        map.put(2, 30);
        map.put(3, 50);
        map.put(4, 40);
        map.put(5, 100);
        map.put(6, 60);
        map.put(7, 110);
        map.put(8, 50);
        map.put(9, 90);
        map.put(10, 70);
        map.put(11, 80);

        map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .forEach(System.out::println); // или любой другой конечный метод
    }
}
package lesson13_map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> fridge = new HashMap<>();
        fridge.put("Apple", 3);
        fridge.put("ORANGE", 2);
        fridge.put("Plum", 6);

        for (String key : fridge.keySet()) {
            System.out.println(key + " " + fridge.get(key));
        }
    }
}

package lesson12_collection;

import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(8);
        numbers.add(4);
        for(Integer n:numbers){
            System.out.println(n);
        }
    }
}

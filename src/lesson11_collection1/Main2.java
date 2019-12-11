package lesson11_collection1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(45);
        numbers.add(734);
        numbers.add(256);
        numbers.add(0);
        numbers.add(347);
        numbers.add(256);

        for (Iterator<Integer> iter=numbers.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}

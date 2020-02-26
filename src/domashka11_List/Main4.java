package domashka11_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        LinkedList<Integer> integers1 = new LinkedList<>();
        for (int i = 0; i <= 100000; i++) {
            integers.add(i);
            integers1.add(i);
        }
        long starttime1 = System.currentTimeMillis();
        for (int i = 0; i <= integers.size()-1; i++) {
            integers.remove(i);
        }
        long starttime2 = System.currentTimeMillis();
        for (int i = 0; i <= integers1.size()-1; i++) {
            integers1.remove(i);
        }
        long starttime3 = System.currentTimeMillis();
        for (int i = integers.size()-1; i >=0; i--) {
            integers.remove(i);
        }
        long starttime4 = System.currentTimeMillis();
        for (int i = integers1.size()-1; i >=0; i--) {
            integers1.remove(i);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("AL remove at first:"+(starttime2-starttime1));
        System.out.println("LL remove at first:"+(starttime3-starttime2));
        System.out.println("AL remove at last:"+(starttime4-starttime3));
        System.out.println("LL remove at last:"+(endtime-starttime4));
    }
}
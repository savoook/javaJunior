package domashka11_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Boolean> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(true);
        }
        LinkedList<Boolean> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(true);
        }
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, false);
        }
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, false);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList add in the beginning: " + (startTime2 - startTime1));
        System.out.println("LinkedList add in the beginning: " + (endTime - startTime2));

        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(60000, false);
        }
        long startTime4 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(60000, false);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("ArrayList add in the middle: " + (startTime4 - startTime3));
        System.out.println("LinkedList add in the middle: " + (endTime1 - startTime4));

        long startTime5 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(90000, false);
        }
        long startTime6 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(90000, false);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("ArrayList add in the end: " + (startTime6 - startTime5));
        System.out.println("LinkedList add in the end: " + (endTime2 - startTime6));

        long startTime7 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(0);
        }
        long startTime8 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(0);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("ArrayList remove in the beginning: " + (startTime8 - startTime7));
        System.out.println("LinkedList remove in the beginning: " + (endTime3 - startTime8));

        long startTime9 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(60000);
        }
        long startTime10 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(60000);
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("ArrayList remove in the middle: " + (startTime10 - startTime9));
        System.out.println("LinkedList remove in the middle: " + (endTime4 - startTime10));

        long startTime11 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(90000);
        }
        long startTime12 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(90000);
        }
        long endTime5 = System.currentTimeMillis();
        System.out.println("ArrayList remove in the end: " + (startTime12 - startTime11));
        System.out.println("LinkedList remove in the end: " + (endTime5 - startTime12));
    }
}
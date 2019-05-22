package domashka12;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(5);
        hashSet.add("qwerty");
        hashSet.add("zxcvb");
        hashSet.add("asdfg");
        SetUtilsImpl utils = new SetUtilsImpl();
        Set<String> orderedSet = utils.orderedSet(linkedList, hashSet);
        System.out.println(orderedSet);


        int val1 = 1;
        int val2 = 4;
        int val3 = 3;
        int val4 = 2;
        int val5 = 8;
        Set<Integer> customOrderSet = utils.customOrderSet(val1, val2, val3, val4, val5);
        System.out.println(customOrderSet);
    }
}

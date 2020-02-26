package domashka12_collection;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        String string1 = "qwerty";
        String string2 = "qwerty1";
        String string3 = "qwerty2";
        String string4 = "qwerty3";
        String string5 = "qwerty4";
        ListUtilsImpl utils = new ListUtilsImpl();
        List<String> asList = utils.asList(string1, string2, string3, string4, string5);
        System.out.println(asList);

        ArrayList<Double> list = new ArrayList<>();
        list.add(3.5);
        list.add(4.9);
        list.add(7.9);
        list.add(1.2);
        System.out.println(list);
        List<Double> sortedList = utils.sortedList(list);
        System.out.println(sortedList);
        System.out.println(list);
    }
}

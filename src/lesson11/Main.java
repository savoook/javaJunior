package lesson11;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("eudruuede");
        texts.add("eudrede");
        texts.add("eudrde");
        texts.add("eruuede");
        texts.add("eudrde");
        texts.add("eudruude");
        texts.add(0, "!!!!");
        texts.set(1, "222");
        //texts.clear();
        //texts.contains("eudruuede");

        for (String s : texts) {
            System.out.println(s);
        }
        System.out.println("______________");
        for (int i = 0; i < texts.size(); i++) {
            System.out.println(texts.get(i));
        }
        System.out.println("______________");
        for (Iterator<String> iter=texts.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}

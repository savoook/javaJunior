package domashka5;

import java.util.Arrays;

public class StringMethod {
    public static void numChar(String text) {
        System.out.println(text.length());
    }

    public static void withNewLine(String text) {
        String[] word = text.split(" ");
        for (String subString : word) {
            System.out.println(subString);
        }
    }

    public static char[] vowel(String text) {
        String text1 = text.replaceAll("[aoeuyi.,?!](?!\\b)", "");
        String text2 = text1.replaceAll(" ", "");
        return text2.toCharArray();
    }

    public static void pervaya(String text) {
        String text1 = text.replaceAll("[., ?!](?!\\b)", "");
        String text2 = text1.replaceAll(" ", "");
        char[] a = text2.toCharArray();
        Arrays.sort(a);
        System.out.println(a[0]);
    }

}

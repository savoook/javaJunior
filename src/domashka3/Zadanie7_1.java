package domashka3;

public class Zadanie7_1 {
    public static void main(String[] args) {
        char[] perviy = {'a', 'b', 'c', 'd'};
        char[] vtoroy = {'q', 'w', 'e', 'r'};
        String a = "Are you reAdy to Start studying of proGramming";
        String b = a.toLowerCase();
        for (int i = 0; i < perviy.length; i++) {
            b = b.replace(perviy[i], vtoroy[i]);
        }
        System.out.println(b);
    }
}

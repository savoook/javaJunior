package domashka4;

public class Zadanie1 {
    public static void main(String[] args) {
        String a = "London is the capital of great britain";
        String b = a.replaceAll(" ", "");
        StringBuffer e = new StringBuffer();
        for (int i = 0; i < b.length(); i++) {
            if (i==0||(i+1) % 2 != 0) {
                e.append(b.charAt(i));
            }
        }
        System.out.println(e);
    }
}
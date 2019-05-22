package domashka4;

public class Zadanie3 {
    public static void main(String[] args) {
        String a = "London is the capital of Great Britain";
        char[] b = a.toCharArray();
        char[] c =new char[b.length];
        for (int i=b.length-1; i>=0;i--){
            c[Math.abs(i-(b.length-1))]=b[i];
        }
        System.out.println(c);
    }
}

package domashka2;

public class Primer6 {
    public static void main(String[] args) {
        double summa = 10000;
        double proz = 7;
        for (int i = 0; i < 20; i++) {
            summa = summa * (proz/100+1);
        }
        System.out.println(summa);
    }
}

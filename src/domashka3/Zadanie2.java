package domashka3;

public class Zadanie2 {
    public static void main(String[] args) {
        int[] num = {2, 5, 4, 7, 8, 6, 1};
        int sumnum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                sumnum += num[i];
            }
        }
        System.out.println(sumnum);
    }
}

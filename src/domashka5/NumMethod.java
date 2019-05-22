package domashka5;

public class NumMethod {
    public static void smallestNum(int chislo1, int chislo2, int chislo3) {
        System.out.println(Math.min(Math.min(chislo1, chislo2), Math.min(chislo2, chislo3)));
    }

    public static void biggestNum(int chislo1, int chislo2, int chislo3) {
        int max = chislo1;
        if (chislo2 >= chislo1&&chislo2>=chislo3) {
            max = chislo2;
        } else if (chislo3 >= chislo1) {
            max = chislo3;
        }
        System.out.println(max);
    }
}

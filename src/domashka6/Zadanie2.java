package domashka6;

public class Zadanie2 {
    public static void main(String[] args) {
        int[][] num = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        for (int i = 0; i < num.length; i++) {
            int j = i;
            System.out.print(num[i][j] + " ");
            System.out.println();
            int k = 0;
            do {
                System.out.print("  ");
                k++;
            } while (k <= i);
        }
    }
}

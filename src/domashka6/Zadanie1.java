package domashka6;

public class Zadanie1 {
    public static void main(String[] args) {
        int[][] num = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
            int k = 0;
            do {
                System.out.print("  ");
                k++;
            } while (k <= i);
        }
    }
}

package domashka6;

public class Zadanie3 {
    public static void main(String[] args) {
        int[][] num2 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int[][] num1 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        for (int i = 0; i < num1.length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num1[i][j] + "   ");
            }
            for (int k = i; k <num2.length; k++) {
                System.out.print(num2[i][k] + "   ");
            }
           System.out.println();
        }
    }
}

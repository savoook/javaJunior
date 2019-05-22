package lesson6;

public class Main5 {
    public static void main(String[] args) {
        //int[][] pir = new int[5][9];
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                //  pir[i][j]='1';
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
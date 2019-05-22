package lesson6;

public class Main3 {
    public static void main(String[] args) {
        int[][] num = new int[4][3];
        int startNum = 2;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                num[i][j] = startNum;
                startNum += 2;
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                if (num[i][j] < 10) {
                    System.out.print(num[i][j] + "  ");
                } else {
                    System.out.print(num[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

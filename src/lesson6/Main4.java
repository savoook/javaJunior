package lesson6;

public class Main4 {
    public static void main(String[] args) {
        int[][] num = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        System.out.print(num[0][0]);
        System.out.println();
        System.out.print(num[1][0] + " ");
        System.out.print(num[1][1] + " ");
        System.out.println();
        System.out.print(num[2][0] + " ");
        System.out.print(num[2][1] + " ");
        System.out.print(num[2][2] + " ");
        System.out.println();
        System.out.print(num[3][0] + " ");
        System.out.print(num[3][1] + " ");
        System.out.print(num[3][2] + " ");
        System.out.print(num[3][3] + " ");
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}

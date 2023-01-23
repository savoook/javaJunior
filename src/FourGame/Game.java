package FourGame;

import java.util.Scanner;

public class Game {


    public static String[][] desk = new String[6][7];
    public static int currentMove = 0;
    public static final String PLAYER1 = "Player 1 [RED]";
    public static final String PLAYER2 = "Player 2 [GREEN]";
    public static final String PLAYER1_DISK = "R";
    public static final String PLAYER2_DISK = "G";

    public static void main(String[] args) {
        int column;
        int line;
        printDesk();
        System.out.println(desk.length - 1);
        do {
            currentMove++;
            column = doAction();
            line = putDisk(column);
            printDesk();
        } while (isContinue(line, column) && !deskIsFull());
    }

    // Check if desk if full
    public static boolean deskIsFull() {
        for (int i = 0; i < desk[0].length; i++) {
            if (desk[0][i] == null) {
                return false;
            }
        }
        return true;
    }

    // Show grid
    public static void printDesk() {
        for (int i = 0; i < desk.length; i++) {
            for (int k = 0; k < desk[0].length; k++) {
                String val = desk[i][k] == null ? " " : desk[i][k];
                System.out.print("|" + val);
            }
            System.out.println("|");
        }
    }

    // Player choice
    public static int doAction() {
        int playerInput = -1;
        String player = currentMove % 2 == 0 ? PLAYER2 : PLAYER1;

        while (playerInput == -1) {
            System.out.println(player + " - choose column (1-7):");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                playerInput = sc.nextInt();
                if (playerInput < 8 && playerInput > 0) {
                    playerInput = playerInput - 1;
                    if (desk[0][playerInput] != null) {
                        playerInput = -1;
                        System.out.println("The column is full. Choose another column");
                    }
                } else {
                    System.out.println("Uncorrect select");
                    playerInput = -1;
                }
            }
        }
        return playerInput;
    }

    // Fill the array
    public static int putDisk(int column) {
        String disk = currentMove % 2 == 0 ? PLAYER2_DISK : PLAYER1_DISK;
        int line = desk.length - 1;
        for (int i = line; i >= 0; i--) {
            if (desk[i][column] == null) {
                desk[i][column] = disk;
                return i;
            }
        }
        return line;
    }

    //метод проверки победителя
    public static boolean isContinue(int line, int column) {
        String player = currentMove % 2 == 0 ? PLAYER2 : PLAYER1;
        String curValue = desk[line][column];
        if (checkHorisontal(line, curValue) || checkVertical(column, curValue) || checkDiagonal(curValue)) {
            System.out.println(player + " WON");
            return false;
        }

        return true;
    }

    //метод проверки горизонтали
    public static boolean checkHorisontal(int line, String curValue) {
        int match = 0;
        for (int k = 0; k < desk[0].length; k++) {
            if (desk[line][k] == curValue) {
                match++;
            } else {
                match = 0;
            }
            if (match == 4) {
                return true;
            }
        }
        return false;
    }

    //метод проверки вертикали
    public static boolean checkVertical(int column, String curValue) {
        int match = 0;
        for (int k = desk.length - 1; k >= 0; k--) {
            if (desk[k][column] == curValue) {
                match++;
            } else {
                match = 0;
            }
            if (match == 4) {
                return true;
            }
        }
        return false;
    }

    //метод проверки диагонали
    public static boolean checkDiagonal(String curValue) {
        int length = desk.length;
        int length1 = desk[0].length;
        int match = 0;
        // upper
        for (int k = 0; k < length; k++) {
            for (int j = 0; j <= k; j++) {
                int i = k - j;
                if (desk[i][j] == curValue) {
                    match++;
                } else {
                    match = 0;
                }
                if (match == 4) {
                    return true;
                }
            }
            match = 0;
        }
        //lower
//        for (int k = length - 2; k >= 0; k--) {
//            for (int j = 0; j <= k; j++) {
//                int i = k - j;
//                if (desk[length - j - 1][length - i - 1] == curValue) {
//                    match++;
//                } else {
//                    match = 0;
//                }
//                if (match == 4) {
//                    return true;
//                }
//            }
//            match = 0;
//        }
        for (int k = desk[0].length - 2; k >= 0; k--) {
            for (int j = 0; j <= k; j++) {
                int i = k - j;
                if (desk[length - j - 1][length1 - i - 1] == curValue) {
                    match++;
                } else {
                    match = 0;
                }
                if (match == 4) {
                    return true;
                }
            }
            match = 0;
        }
        // lower 1
        for (int k = 0; k < length; k++) {

            for (int j = 0; j < length - k; j++) {
                int i = j + k;
                if (desk[i][j] == curValue) {
                    match++;
                } else {
                    match = 0;
                }
                if (match == 4) {
                    return true;
                }
            }
            match = 0;
        }
        return false;
    }
}


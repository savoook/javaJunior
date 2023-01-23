package connectFourGame;

import java.util.ArrayList;

public class Game {
    private char[][] desc = {{'O', 'O', 'O', 'O', 'O', 'O', 'O'}, {'O', 'O', 'O', 'O', 'O', 'O', 'O'}, {'O', 'O', 'O', 'O', 'O', 'O', 'O'}, {'O', 'O', 'O', 'O', 'O', 'O', 'O'}, {'O', 'O', 'O', 'O', 'O', 'O', 'O'}, {'O', 'O', 'O', 'O', 'O', 'O', 'O'}};
    ArrayList<Player> players = new ArrayList<>();


    public void addPlayer(Player player) {
        players.add(player);
    }

    public void doRound(int choice, Player player) {
        for (int i = 5; i >= 0; i--) {
            if (desc[i][choice - 1] == 'O') {
                desc[i][choice - 1] = player.getColor();
                break;
            }
        }
    }


    public void printDesc() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(desc[i][j]);
            }
            System.out.println();
        }
    }

    public boolean isContinue() {
////        char curValue = desc[i][choice];
////        int match = 0;
////        for (int k = 0; k < desc[0].length; k++) {
////            if (desc[i][k] == curValue) {
////                match++;
////            } else {
////                match = 0;
////            }
////            if (match == 4) {
////                return true;
////            }
////        }
        return false;
    }
}
package connectFourGame;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Красный", 'К');
        Player player2 = new Player("Зеленый", 'З');
        Game game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);

        System.out.println("__Sample Run__");
        game.printDesc();
        while (game.isContinue()) {
            game.doRound(player1.doAction(),player1);
            game.printDesc();
            game.doRound(player2.doAction(),player2);
            game.printDesc();
        }
        System.out.println("__" + player1+ " " + player1.getColor() + "wins__");
    }
}

package connectFourGame;

import java.util.Scanner;

public class Player {
    private String name;
    private char color;

    public Player() {
    }

    public Player(String name, char color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }


    public int doAction() {
        System.out.println(this.name + " " + this.color + "- choose column (1-7):");
        Scanner sc = new Scanner(System.in);
        String playerInput = sc.nextLine();
        return Integer.parseInt(playerInput);
    }
}





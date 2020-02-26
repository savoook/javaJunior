package lesson13_map;

public class Main1 {
    public static void main(String[] args) {
        Tournament tournament=new Tournament();
        tournament.addTeam("Спартак",3);
        tournament.addTeam("Динамо",9);
        tournament.addTeam("Челси",4);
        tournament.addTeam("ЦСКА",1);
        tournament.addTeam("Динамо",8);
        //tournament.printTable();
        //tournament.printWiner();
        //tournament.printLooser();
        //tournament.printLooser1();
        tournament.printSortTable();
        tournament.printSortTable();
    }
}

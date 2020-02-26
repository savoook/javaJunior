package lesson13_map;

import java.util.*;

public class Tournament {
    private String nameTournament;
    private HashMap<String, Integer> teams = new HashMap<>();

    public Tournament() {

    }

    public Tournament(String name) {
        nameTournament = name;
    }

    public String getNameTournament() {
        return nameTournament;
    }

    public void setNameTournament(String nameTournament) {
        this.nameTournament = nameTournament;
    }

    public void addTeam(String nameTeam, int points) {
        if (teams.containsKey(nameTeam)) {
            int currentPoints = teams.get(nameTeam);
            teams.put(nameTeam, points + currentPoints);
        } else {
            teams.put(nameTeam, points);
        }
    }

    public void printTable() {
        for (String key : teams.keySet()) {
            System.out.printf("Команда-%s,Очков-%d\n", key, teams.get(key));
        }
    }

    public void printWiner() {
        int max = 0;
        String winner = "";
        for (String key : teams.keySet()) {
            if (teams.get(key) > max) {
                max = teams.get(key);
                winner = key;
            }
        }
        System.out.println(winner + "-" + max);
    }

    public void printLooser() {
        int max = 0;
        String winner = "";
        for (String key : teams.keySet()) {
            if (teams.get(key) > max) {
                max = teams.get(key);
            }
        }
        int min = max;
        String looser = "";
        for (String key : teams.keySet()) {
            if (teams.get(key) < min) {
                min = teams.get(key);
                looser = key;
            }
        }
        System.out.println(looser + "-" + min);
    }

    public void printLooser1() {
        int min = Integer.MAX_VALUE;
        String looser = "";
        for (String key : teams.keySet()) {
            if (teams.get(key) < min) {
                min = teams.get(key);
                looser = key;
            }
        }
        System.out.println(looser + "-" + min);
    }

    public void printSortTable() {
        teams.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
    public void printSortedTable1()  {
        //Using Stream API
//        teams.entrySet().stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .forEach(System.out::println);

//        Using comparator
//        int size = teams.size();
//        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(size);
//        list.addAll(teams.entrySet());
//        ValueComparator<Integer> cmp = new ValueComparator<Integer>();
//        Collections.sort(list, cmp);
//
//        for (int i = 0; i < size; i++) {
//            System.out.println(list.get(i));
//        }

        //Using Comparator with TreeMap

        MyComparator comparator = new MyComparator(teams);

        TreeMap<String, Integer> map = new TreeMap<String, Integer>(comparator);
        map.putAll(teams);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Team - " + entry.getKey() + " | points - " + entry.getValue());
        }

    }

//    private class ValueComparator<V extends Comparable<? super V>>
//            implements Comparator<Map.Entry<?, V>> {
//        public int compare(Map.Entry<?, V> o1, Map.Entry<?, V> o2) {
//            return o2.getValue().compareTo(o1.getValue());
//        }
//    }

    class MyComparator implements Comparator<Object> {

        Map<String, Integer> map;

        public MyComparator(Map<String, Integer> map) {
            this.map = map;
        }

        public int compare(Object o1, Object o2) {

            if (map.get(o2) == map.get(o1))
                return 1;
            else
                return  (map.get(o2)).compareTo(map.get(o1));

        }
    }
}



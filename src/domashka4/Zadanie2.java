package domashka4;

public class Zadanie2 {
    public static void main(String[] args) {
        String stroka = "London is the capital of Great Britain";
        while (stroka.contains(" ")){
            int probel = stroka.indexOf(" ");
            String strokaNew = stroka.substring(0, probel);
            stroka = stroka.substring(probel+1);
            System.out.println(strokaNew);
        }
        System.out.println(stroka);
    }
}
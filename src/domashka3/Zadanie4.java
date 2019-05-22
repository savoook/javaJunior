package domashka3;

public class Zadanie4 {
    public static void main(String[] args) {
        char[] perviy = {'a', 'b', 'c', 'd'};
        char[] vtoroy = {'q', 'w', 'e', 'r'};
        char[] tretiy = new char[8];
        int j = 0;
        for (int i = 0; i < tretiy.length - 4; i++) {
            tretiy[i] = perviy[j];
            j += 1;
        }
        j = 0;
        for (int i = tretiy.length - 4; i < tretiy.length; i++) {
            tretiy[i] = vtoroy[j];
            j += 1;
        }
        for (int i = 0; i < tretiy.length; i++) {
            System.out.println(tretiy[i]);
        }
    }
}

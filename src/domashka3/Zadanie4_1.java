package domashka3;

public class Zadanie4_1 {
    public static void main(String[] args) {
        char[] perviy = {'a', 'b', 'c', 'd'};
        char[] vtoroy = {'q', 'w', 'e', 'r'};
        char[] tretiy = new char[perviy.length + vtoroy.length];
        for (int i = 0; i < tretiy.length; i++) {
            if (i < perviy.length)
                tretiy[i] = perviy[i];
            else
                tretiy[i] = vtoroy[i-perviy.length];
        }
        for (int i = 0; i < tretiy.length; i++) {
            System.out.println(tretiy[i]);
        }
    }
}

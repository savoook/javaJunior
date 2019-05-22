package lesson3;

public class Main4 {
    public static void main(String[] args) {
        char[] symbols = {'w', 'q', 'a', 'x', 'i'};
        for (int i=0; i<symbols.length; i++){
            if (symbols[i]=='a'||symbols[i]=='o'||symbols[i]=='i') {
                System.out.println(i);
            }
        }
    }
}

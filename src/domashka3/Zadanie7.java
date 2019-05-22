package domashka3;

public class Zadanie7 {
    public static void main(String[] args) {
        char[] perviy = {'a', 'b', 'c', 'd'};
        char[] vtoroy = {'q', 'w', 'e', 'r'};
        char[] perviyUpp = new char [perviy.length];
        char[] vtoroyUpp = new char [vtoroy.length];
        for (int i = 0; i < perviy.length; i++) {
             perviyUpp[i]=Character.toUpperCase(perviy[i]);
             vtoroyUpp[i]=Character.toUpperCase(vtoroy[i]);
        }
        String a = "Are you reaDy to start stuDying of programming";
        char[] b = a.toCharArray();
        for (int j = 0; j < perviy.length; j++) {
            for (int i = 0; i < b.length; i++) {
                if (b[i] == perviy[j]) {
                    b[i] = vtoroy[j];
                }
                if (b[i] == perviyUpp[j]) {
                    b[i] = vtoroyUpp[j];
                }
            }
        }
        System.out.println(b);
    }
}

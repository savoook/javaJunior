package domashka3;

public class Zadanie6 {
    public static void main(String[] args) {
        String a = "У меня всё хорошо, замечательно, у меня всё-получается!";
        char[] b=a.toCharArray();
        for (int i=0;i<b.length;i++){
            if (b[i]==','||b[i]=='-'||b[i]=='!'){
                b[i]=' ';
            }
        }
        System.out.println(b);
    }
}

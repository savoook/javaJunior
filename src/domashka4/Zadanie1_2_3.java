package domashka4;

public class Zadanie1_2_3 {
    public static void main(String[] args) {
        String a = "London is the capital of great britain";
        StringBuffer b = new StringBuffer(a);
        char[] c = a.toCharArray();
        for (int i = 0; i < b.length(); i++) {
            //if (i==0||(i+1)%2==0)||c[i]=' '){
            //if (c[i+1] != ' ') {
              //  b.setCharAt(i+1,' ');
          //  }
          //  else{
          //      b.setCharAt(i+1,' ');
           //     i=i+1;
          //  }
        }
        System.out.println(b);
    }
}

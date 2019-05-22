package domashka3;

public class Zadanie1 {
    public static void main(String[] args) {
        int[] num={32,56,38,73};
        int sumnum=0;
        for (int i=0; i<num.length; i++){
            sumnum +=num[i];
            System.out.println(num[i]);
        }
        System.out.println(sumnum);
    }
}

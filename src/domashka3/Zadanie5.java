package domashka3;

public class Zadanie5 {
    public static void main(String[] args) {
        char[] perviy = {'a', 'b', 'c', 'd'};
        char[] vtoroy=new char[4];
        int k=0;
        for (int i=perviy.length-1;i>=0;i--){
          vtoroy[k]=perviy[i];
          k+=1;
        }
        for (k=0;k<vtoroy.length;k++){
            System.out.println(vtoroy[k]);
        }
    }
}

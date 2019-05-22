package lesson6;

public class Main1 {
    public static void main(String[] args) {

        Main1.firstCh("This is war");

    }
    public static void firstCh (String text){
        String textToLow=text.toLowerCase();
        String alf="abcdefghijklmnopqrstuvwxyz";
        int [] indexes=new int[text.length()];
        for (int i=0; i<textToLow.length();i++){
            char current=textToLow.charAt(i);
            int index=alf.indexOf(current);
            indexes[i]=index;
        }
        int min=indexes[0];
        for (int i=0;i<indexes.length;i++){
            if (indexes[i]<min&&indexes[i]!=-1){
                min=indexes[i];
            }
        }
        System.out.println(alf.charAt(min));
    }
}

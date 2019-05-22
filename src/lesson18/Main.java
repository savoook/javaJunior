package lesson18;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File dirFrom = new File("F:\\Закачки");
        // System.out.println(dirFrom.exists());
        // if (!dirFrom.exists()){
        //    dirFrom.mkdir();
        File[] filesFromDir = dirFrom.listFiles();
        for (File file : filesFromDir) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
//}

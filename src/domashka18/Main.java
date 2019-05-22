package domashka18;

import domashka18.FileCopyWithChannel;
import domashka18.FileCopyWithJava7;

public class Main {
    public static void main(String[] args) {
        FileCopyWithChannel copyUtils1 = new FileCopyWithChannel();
        FileCopyWithJava7 copeUtils2 = new FileCopyWithJava7();

        try {
            copyUtils1.copyFile("C:\\Users\\User\\Desktop\\87002943.jpg", "C:\\Users\\User\\Desktop\\этоить.jpg");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }

        try {
            copeUtils2.copyFile("C:\\Users\\User\\Desktop\\87002943.jpg", "C:\\Users\\User\\Desktop\\этить1.jpg");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
    }
}

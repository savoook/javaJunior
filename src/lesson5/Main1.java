package lesson5;

import java.lang.Character;
import java.applet.AppletStub;
import java.io.PrintStream;

public class Main1 {
    public static void main(String[] args) {
        String text = "qwerty";
        text.length();
        Student.printHello();
        int result = Student.squareArea(12);
        int result1 = Student.squareArea(16);
        String a = StringUtils.reversText("Text");
        String b = StringUtils.reversText("qwertyuiop");
        int z = Student.perimetrTreugolnika(1, 2, 3);
        String c = StringUtils.netGlasnih("London");
         StringUtils.printGlassFromText("London");

    }
}

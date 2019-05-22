package lesson10;

public class Monkey extends Object implements Animal {
    @Override
    public void breath() {
        System.out.println("Обезьяна дышит");
    }

    @Override
    public void voice() {
        System.out.println("ayayayayayaya");
    }
}

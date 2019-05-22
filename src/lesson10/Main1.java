package lesson10;

public class Main1 {
    public static void main(String[] args) {
       // Animal animal=new Animal() {
        //}
        Monkey monkey=new Monkey();
        Leon leon=new Leon();
        Animal[] animals=new Animal[2];
        animals[0]=leon;
        animals[1]=monkey;
        for (Animal a:animals){
            a.voice();
        }
    }
}

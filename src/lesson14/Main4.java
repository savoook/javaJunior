package lesson14;

public class Main4 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Pavel");
        try {
            person.setEdge(31);
        } catch (RuntimeException e) {
            System.out.println("что-то не так");
        } catch (EdgePersonExeption edgePersonExeption) {
        }
        System.out.println(person);
    }
}

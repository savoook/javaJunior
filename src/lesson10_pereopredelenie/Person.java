package lesson10_pereopredelenie;

public class Person {
    private int age;
    private String name;
    private  String phone;
    private int rost;
    public Person(){

    }
    public Person(int age1, String name1){
        age=age1;
        name=name1;

    }
    public Person(int age2, int rost2){
        age=age2;
        rost=rost2;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", rost=" + rost +
                '}';
    }
}

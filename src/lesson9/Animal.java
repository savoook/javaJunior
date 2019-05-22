package lesson9;

//import java.

public class Animal extends Object {
    private int age;
    private String name;
    private String typeOfFood;
    private int price;

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

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (price != animal.price) return false;
        if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
        return typeOfFood != null ? typeOfFood.equals(animal.typeOfFood) : animal.typeOfFood == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (typeOfFood != null ? typeOfFood.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", typeOfFood='" + typeOfFood + '\'' +
                ", price=" + price +
                '}';
    }
    public void voice(){
        System.out.println("гав");
    }
}

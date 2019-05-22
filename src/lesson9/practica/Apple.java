package lesson9.practica;

public class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", weight=" + this.getWeight() +
                ", priceOpt=" + this.getPriceOpt() +
                ", isFresh=" + this.isFresh() +
                '}';
    }
}

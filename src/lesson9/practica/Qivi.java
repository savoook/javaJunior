package lesson9.practica;

public class Qivi extends Fruit {
    @Override
    public String toString() {
        return "Qivi{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", weight=" + this.getWeight() +
                ", priceOpt=" + this.getPriceOpt() +
                ", isFresh=" + this.isFresh() +
                '}';
    }
}

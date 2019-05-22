package lesson9.practica;

public class Fruit {
    private String name;
    private int price;
    private int weight;
    private int priceOpt;
    private boolean isFresh = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPriceOpt() {
        return priceOpt;
    }

    public void setPriceOpt(int priceOpt) {
        this.priceOpt = priceOpt;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fruit fruit = (Fruit) o;

        if (price != fruit.price) return false;
        if (weight != fruit.weight) return false;
        if (priceOpt != fruit.priceOpt) return false;
        if (isFresh != fruit.isFresh) return false;
        return name != null ? name.equals(fruit.name) : fruit.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + weight;
        result = 31 * result + priceOpt;
        result = 31 * result + (isFresh ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", priceOpt=" + priceOpt +
                ", isFresh=" + isFresh +
                '}';
    }
}

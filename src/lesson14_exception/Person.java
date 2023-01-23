package lesson14_exception;

public class Person {
    private int edge;
    private String name;

    public Person() {
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) throws EdgePersonExeption {
        if(edge<0||edge>150){
            throw new EdgePersonExeption("edge<0||edge>150");
        }
        this.edge = edge;
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
                "edge=" + edge +
                ", name='" + name + '\'' +
                '}';
    }
}

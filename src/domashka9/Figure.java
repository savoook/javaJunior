package domashka9;

public class Figure {
    private String name;
    private String structure;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void printPerimetr() {
        System.out.println("perimetr");
    }

    public void printPloshad() {
        System.out.println("ploshad");
    }
}

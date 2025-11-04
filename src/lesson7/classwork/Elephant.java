package lesson7.classwork;


public class Elephant {
    private String name;
    private String color;
    private String size;
    public Elephant(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;

    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


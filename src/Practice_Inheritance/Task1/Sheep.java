package Practice_Inheritance.Task1;

public class Sheep extends Animals{
    private String color;

    public Sheep() {
    }

    public Sheep(String name, String cender, int age, String color) {
        super(name, cender, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "Color: " + color ;
    }
}

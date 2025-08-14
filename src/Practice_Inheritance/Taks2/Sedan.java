package Practice_Inheritance.Taks2;

public class Sedan extends CarShowRoom{
    private String model;
    private int price;
    private String color;
    private String yearOfIssue;

    public Sedan() {
    }

    public Sedan(String name, String address, String country, int numberCar, String model, int price, String color, String yearOfIssue) {
        super(name, address, country, numberCar);
        this.model = model;
        this.price = price;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return
                "Model: " + model + '\n' +
                "Price: " + price + "\n" +
                "Color: " + color + '\n' +
                "YearOfIssue: " + yearOfIssue;
    }
}

package Practice_Inheritance.Taks2;

public class Truck extends CarShowRoom{
    private String model;
    private int price;
    private String color;
    private String yearOFIssue;

    public Truck() {

    }

    public Truck(String name, String address, String country, int numberCar, String model, int price, String color, String yearOFIssue) {
        super(name, address, country, numberCar);
        this.model = model;
        this.price = price;
        this.color = color;
        this.yearOFIssue = yearOFIssue;
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

    public String getYearOFIssue() {
        return yearOFIssue;
    }

    public void setYearOFIssue(String yearOFIssue) {
        this.yearOFIssue = yearOFIssue;
    }

    @Override
    public String toString() {
        return
                "Model: " + model + '\n' +
                "Price:" + price + "\n" +
                "Color: " + color + '\n' +
                "YearOFIssue: " + yearOFIssue ;
    }
}

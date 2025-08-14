package Practice_Inheritance.Task1;

public class Tiger extends Animals {
    private int number;

    public Tiger() {
    }

    public Tiger(String name, String cender, int age, int number) {
        super(name, cender, age);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString() + "Number: " + number ;
    }
}

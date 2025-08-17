package Lesson_Inheritance.Task1;

public class Dog extends Animal {

    private double weight;
    private boolean isTrained;

    public Dog() {
    }

    public Dog(String name, String gender, int age, double weight, boolean isTrained) {
        super(name, gender, age);
        this.weight = weight;
        this.isTrained = isTrained;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public void bark() {
        System.out.println(getName() + " says: Woof woof!");
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Weight: " + weight + "\n" +
                "IsTrained: " + isTrained ;
    }
}

package Lesson_Inheritance.Task1;

public class Cat extends Animal {
    private String color;
    private String breed;

    public Cat() {

    }

    public Cat(String name, String gender, int age, String color, String breed) {
        super(name, gender, age);
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void catProperties(){
        System.out.println("the cat is very fast");
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Color: " + color + '\n' +
                "Breed: " + breed ;
    }
}

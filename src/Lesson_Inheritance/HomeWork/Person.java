package Lesson_Inheritance.HomeWork;

public class Person {
    private String name;
    private String designation;
    String learning;
    String walking;
    String eating;

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void learn(String subject) {
        learning = subject;
        System.out.println(name + " is learning " + subject + ".");
    }

    public void walk(String place) {
        walking = place;
        System.out.println(name + " is walking " + place + "." );
    }

    public void eat(String food) {
        eating = food;
        System.out.println(name + " is eating  " + food + ".");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Designation: " + designation;
    }
}

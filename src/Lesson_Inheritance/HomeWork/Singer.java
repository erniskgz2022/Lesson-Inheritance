package Lesson_Inheritance.HomeWork;

public class Singer extends Person {
    private String bandName;

    public Singer() {
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println(getName() + " is singing in " + bandName);
    }

    public void playGuitar() {
        System.out.println(getName() + " is playing the guitar.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Band: " + bandName;
    }
}

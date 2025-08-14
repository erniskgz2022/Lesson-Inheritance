package Lesson_Inheritance.HomeWork;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Ali", "Programmer", "JavaSoft");
        Dancer dancer = new Dancer("Leyla", "Dancer", "Street Dance Crew");
        Singer singer = new Singer("Ulukmanapo", "Singer", "Rock Band");

        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();

        System.out.println("\n" + dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();

        System.out.println("\n" + singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGuitar();
    }
}

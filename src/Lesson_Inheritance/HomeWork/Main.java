package Lesson_Inheritance.HomeWork;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Ali", "Programmer", "JavaSoft");
        Dancer dancer = new Dancer("Leyla", "Dancer", "Street Dance Crew");
        Singer singer = new Singer("Ulukmanapo", "Singer", "Rock Band");

        System.out.println(programmer);
        programmer.learn("Math");
        programmer.walk("University");
        programmer.eat("Plov");
        programmer.coding();

        System.out.println("\n" + dancer);
        dancer.learn("Language English");
        dancer.walk("Cour");
        dancer.eat("Besh Barmak");
        dancer.dancing();

        System.out.println("\n" + singer);
        singer.learn("studying vocals");
        singer.walk("dfdsfsf");
        singer.eat("Mastava");
        singer.singing();
        singer.playGuitar();
    }
}

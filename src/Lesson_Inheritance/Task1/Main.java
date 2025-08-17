package Lesson_Inheritance.Task1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("REX","Male",2,25.5,true);
        Cat cat = new Cat("Myi-Myi","Female",1,"Gri","guides");
        System.out.println("~~~~~~~DOG~~~~~~~~");
        System.out.println(dog);
        dog.bark();
        System.out.println("~~~~~~~CAT~~~~~~~~");
        System.out.println(cat);
        cat.catProperties();
    }
}
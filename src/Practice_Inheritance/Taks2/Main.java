package Practice_Inheritance.Taks2;

public class Main {
    public static void main(String[] args) {
        CarShowRoom carShowRoom = new CarShowRoom("Eldik_Avto", "Baityk-Batyr 21","Bishkek",30);
        System.out.println("~~~~~~~~~~Avto Salon~~~~~~~~~~~~");
        System.out.println(carShowRoom);
        System.out.println("~~~~~~~~~~Sedan~~~~~~~~~~~~~~~~~~");
        Sedan sedan = new Sedan();
        sedan.setModel("Mercedes-Benz E Class");
        sedan.setPrice(1000000);
        sedan.setColor("Gri");
        sedan.setNumberCar(10);
        sedan.setYearOfIssue("2024");
        System.out.println(sedan);
        System.out.println("~~~~~~~~~~~~Truck~~~~~~~~~~~~");
        Truck truck = new Truck();
        truck.setModel("Man");
        truck.setPrice(5000000);
        truck.setColor("White");
        truck.setNumberCar(10);
        truck.setYearOFIssue("2022");
        System.out.println(truck);
        System.out.println("~~~~~~~~~~~~MiniVen~~~~~~~~~~");
        MiniVen miniVen = new MiniVen();
        miniVen.setModel("МАЙБАХ");
        miniVen.setPrice(2500000);
        miniVen.setColor("Black");
        miniVen.setNumberCar(10);
        miniVen.setYearOfIssue("2020");
        System.out.println(miniVen);
    }
}

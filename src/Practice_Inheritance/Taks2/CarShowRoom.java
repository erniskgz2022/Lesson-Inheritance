package Practice_Inheritance.Taks2;

public class CarShowRoom {
    private String name;
    private String address;
    private String country;
    private int numberCar;

    public CarShowRoom() {
    }

    public CarShowRoom(String name, String address, String country, int numberCar) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.numberCar = numberCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + '\n' +
                "Address: " + address + '\n' +
                "Country: " + country + "\n" +
                "NumberCar: " + numberCar ;
    }
}

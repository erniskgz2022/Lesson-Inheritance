package Practice_Inheritance.Task1;

public class Animals {
    private String name;
    private String cender;
    private int age;

    public Animals() {
    }

    public Animals(String name, String cender, int age) {
        this.name = name;
        this.cender = cender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCender() {
        return cender;
    }

    public void setCender(String cender) {
        this.cender = cender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + '\n' +
                "Cender: " + cender + '\n' +
                "Age: " + age + "\n" ;
    }
}

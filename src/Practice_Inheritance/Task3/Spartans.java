package Practice_Inheritance.Task3;

public class Spartans {
    private String name;
    private  int count;

    public Spartans() {
    }

    public Spartans(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void showInfo() {
        System.out.println("Аты: " + name + ", Саны: " + count);
    }
}

package Lesson_Inheritance.HomeWork;

public class Dancer extends Person {
    private String groupName;

    public Dancer() {
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println(getName() + " is dancing in " + groupName);
    }

    @Override
    public String toString() {
        return super.toString() + ", Group: " + groupName;
    }
}

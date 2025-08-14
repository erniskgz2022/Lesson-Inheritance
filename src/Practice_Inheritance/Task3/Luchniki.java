package Practice_Inheritance.Task3;

class Luchniki extends Spartans {
    private int arrowCount;
    private String bowType;

    public Luchniki(String name, int count, int arrowCount, String bowType) {
        super(name, count);
        this.arrowCount = arrowCount;
        this.bowType = bowType;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public String getBowType() {
        return bowType;
    }

    public void setBowType(String bowType) {
        this.bowType = bowType;
    }

    public void shootArrow() {
        System.out.println(getName() + " жаа атты!");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Жебе саны: " + arrowCount + ", Жаа түрү: " + bowType);
    }
}

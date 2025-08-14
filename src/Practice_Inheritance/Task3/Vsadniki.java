package Practice_Inheritance.Task3;

class Vsadniki extends Spartans {
    private String horseName;
    private String weapon;

    public Vsadniki(String name, int count, String horseName, String weapon) {
        super(name, count);
        this.horseName = horseName;
        this.weapon = weapon;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void ride() {
        System.out.println(getName() + " аты менен чуркады!");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Ат аты: " + horseName + ", Курал: " + weapon);
    }
}


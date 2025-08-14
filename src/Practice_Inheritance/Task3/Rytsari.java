package Practice_Inheritance.Task3;

class Rytsari extends Spartans {
    private String swordType;
    private String armorType;

    public Rytsari(String name, int count, String swordType, String armorType) {
        super(name, count);
        this.swordType = swordType;
        this.armorType = armorType;
    }

    public String getSwordType() {
        return swordType;
    }

    public void setSwordType(String swordType) {
        this.swordType = swordType;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public void attack() {
        System.out.println(getName() + " кылыч менен чабуул койду!");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Кылыч түрү: " + swordType + ", Саар курал: " + armorType);
    }
}

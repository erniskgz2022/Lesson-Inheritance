package Practice_Inheritance.Task3;

class Filosofy extends Spartans {
    private String bookName;
    private String idea;

    public Filosofy(String name, int count, String bookName, String idea) {
        super(name, count);
        this.bookName = bookName;
        this.idea = idea;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public void think() {
        System.out.println(getName() + " терең ой жүгүртүп жатат!");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Китеп: " + bookName + ", Идея: " + idea);
    }
}

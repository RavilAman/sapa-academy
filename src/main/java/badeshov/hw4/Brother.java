package badeshov.hw4;

public class Brother extends Parent {

    private String profession;

    public Brother (String name, int age, String profession) {
        super(name, age);
        this.profession = profession;
    }

    public String getProfession() {
        return this.profession;
    }
}

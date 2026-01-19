package timur.hw4;

public class Timur extends Parent {

    private String profession;

    public Timur(String name, int age, String nation, String profession) {
        super(name, age, nation);
        this.profession = profession;

    }
    public String getProfession(){
        return profession;
    }
}

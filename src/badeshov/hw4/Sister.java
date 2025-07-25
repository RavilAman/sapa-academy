package badeshov.hw4;

public class Sister extends Parent {

    private String hobby;

    public Sister(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return this.hobby;
    }
}

package ulykbekova.hw.four;

public class Dota1 extends Parent {
    private String profesion;

    public Dota1(String name, int age, String profesion) {
        super(name, age);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return this.profesion;
    }
}

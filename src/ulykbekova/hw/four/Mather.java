package ulykbekova.hw.four;

public class Mather extends Parent {
    public String car;

    public Mather(String name, int age, String car) {
        super(name, age);
        this.car = car;
    }

    public String getCar() {
        return this.car;
    }
}

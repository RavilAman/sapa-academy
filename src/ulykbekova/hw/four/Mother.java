package ulykbekova.hw.four;

public class Mother extends Parent {
    public String car;
    public Mother(String name, int age, String car) {
        super(name, age);
        this.car = car;
    }
    public String getCar() {
        return this.car;
    }
}
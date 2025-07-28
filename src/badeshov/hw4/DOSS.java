package badeshov.hw4;

public class DOSS extends Parent {

    private String course;

    public DOSS(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public String getCourse() {
        return this.course;
    }

    @Override
    public String getName() {
        return "Your boss is " + super.getName();
    }
}

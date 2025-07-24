package ulykbekova.hw.four;

public class Dota2 extends Parent {
    public String child;

    public Dota2(String name, int age, String child) {
        super(name, age);
        this.child = child;
    }

    public String getChild() {
        return this.child;
    }

}
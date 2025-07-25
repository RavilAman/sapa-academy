package yernat.hw4;

public class LittleSister extends Parent{

    private String toy;

    public LittleSister(String name, int age, String toy) {
        super(name, age);
        this.toy = toy;
    }

    public String getToy(){
        return this.toy;
    }

    public String getName(){
        return "Our little princess " + super.getName();
    }
}

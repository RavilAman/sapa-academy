package timur.hw4;

public class Parent {
    private String name;
    private int age;
    private String nation;

    public Parent(String name, int age, String nation) {
        this.name = name;
        this.age = age;
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNation() {
        return nation;
    }

    @Override
    public String toString(){
        return ("Имя " + this.name + " " + "Age " + this.age + " " + "Nation " + this.nation);
    }
}

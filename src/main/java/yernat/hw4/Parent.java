package yernat.hw4;

public class Parent {

    private String name;
    private int age;

    public Parent(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return "{name = " + this.name + " age: " + this.age + " } ";
    }
}

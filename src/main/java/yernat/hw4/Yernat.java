package main.java.yernat.yernat.hw4;

public class Yernat extends Parent {

    private String profession;

    public Yernat(String name, int age, String profession){
        super(name, age);
        this.profession = profession;
    }

    public String getProfession(){
        return this.profession;
    }

    public String getName(){
        return "Mr " + super.getName();
    }
}

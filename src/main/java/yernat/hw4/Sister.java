package main.java.yernat.yernat.hw4;

public class Sister extends Parent {

    private int grade;

    public Sister(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade(){
        return this.grade;
    }

    public String getName(){
        return "Mrs " + super.getName();
    }
}

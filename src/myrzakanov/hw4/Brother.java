package myrzakanov.hw4;

public class Brother extends Parent{

    private String sport;

    public Brother(String name, int age, String sport){
        super(name, age);
        this.sport = sport;
    }

    public String getSport(){
        return this.sport;
    }

}

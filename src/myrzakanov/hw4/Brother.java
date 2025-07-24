package myrzakanov.hw4;

public class Brother extends Parent{

    private String Sport;

    public Brother(String name, int age, String Sport){
        super(name, age);
        this.Sport = Sport;
    }

    public String getSport(){
        return this.Sport;
    }

}

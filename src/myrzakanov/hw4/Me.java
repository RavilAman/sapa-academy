package myrzakanov.hw4;

public class Me  extends Parent{

    private String hobbi;

    public Me(String name, int age, String hobbi){
        super(name, age);
        this.hobbi = hobbi;
    }

    public String getHobbi(){
        return this.hobbi;
    }

    @Override
    public String getName(){
        return "Myrzakanov " + super.getName();
    }
}

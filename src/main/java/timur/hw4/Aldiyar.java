package timur.hw4;

public class Aldiyar extends Parent{

    private String hobbi;

    public Aldiyar(String name, int age, String nation, String hobbi){
        super(name, age, nation);
        this.hobbi = hobbi;
    }
    public String getHobbi(){
        return this.hobbi;
    }
}

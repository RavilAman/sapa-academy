package yerasyl;

public class Brother2 extends Parent{
    private String dohobby;
    public Brother2(String name, int age, String dohobby){
        super(name,age);
        this.dohobby = dohobby;
    }

    public String dohobby(){
        return dohobby;
    }
}

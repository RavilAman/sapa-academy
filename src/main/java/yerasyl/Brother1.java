package yerasyl;

public class Brother1 extends Parent{
    private String achieve;
    public Brother1(String name, int age, String achieve){
        super(name,age);
        this.achieve = achieve;
    }

    public String getAchieve(){
        return achieve;

    }
}

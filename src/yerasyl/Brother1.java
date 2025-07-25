package yerasyl;

public class Brother1 extends Parent{
    private String Achieve;
    public Brother1(String name, int age, String Achive){
        super(name,age);
        this.Achieve = Achive;
    }

    public void getAchieve(){
        System.out.println("He is professional "+Achieve+" athlete");

    }
}

package yerasyl;

public class I extends Parent{
    private String Edu;
    public I(String name, int age, String Edu){
        super(name,age);
        this.Edu = Edu;
    }

    public void getEdu(){
        System.out.println("He studies in "+Edu);
    }
}

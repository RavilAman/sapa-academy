package yerasyl;

public class I extends Parent{
    private String edu;
    public I(String name, int age, String edu){
        super(name,age);
        this.edu = edu;
    }

    public String getEdu(){
       return edu;
    }
}

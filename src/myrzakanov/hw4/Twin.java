package myrzakanov.hw4;

public class Twin extends Parent{

    private String Profession;

    public Twin(String name, int age, String Profession){
        super(name, age);
        this.Profession = Profession;
    }

    public String getProfession(){
        return this.Profession;
    }

    @Override
    public int getAge(){
        return super.getAge() + 1;
    }
}

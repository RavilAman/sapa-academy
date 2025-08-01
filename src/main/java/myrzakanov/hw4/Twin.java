package myrzakanov.hw4;

public class Twin extends Parent{

    private String profession;

    public Twin(String name, int age, String profession){
        super(name, age);
        this.profession = profession;
    }

    public String getProfession(){
        return this.profession;
    }

    @Override
    public int getAge(){
        return super.getAge() + 1;
    }
}

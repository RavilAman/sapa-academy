package example.lesson5;

public final class Arsen extends Parent {

  private String profession;

  public Arsen(String name, int age, String profession) {
    super(name, age);
    this.profession = profession;
  }

  public String getProfession() {
    return this.profession;
  }

  @Override
  public String getName(){
    return "MR " + super.getName();
  }

}

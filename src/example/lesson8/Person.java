package example.lesson8;

public class Person implements Comparable<Person> {

  private String name;
  private int age;
  private String iin;

  public Person(String name, int age, String iin) {
    this.name = name;
    this.age = age;
    this.iin = iin;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getIin() {
    return iin;
  }

  public void setIin(String iin) {
    this.iin = iin;
  }

  @Override
  public int compareTo(Person o) {
    return this.getName().compareTo(o.getName());
  }

  @Override
  public String toString() {
    return "Person{" +
      "name='" + name + '\'' +
      ", age=" + age +
      ", iin='" + iin + '\'' +
      '}';
  }
}

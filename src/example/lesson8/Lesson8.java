package example.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Lesson8 {

  public static void main(String[] args) {

    Person arsen = new Person("Arsen", 60, "040400303300403004");
    Person zhandos = new Person("Zhandos", 40, "040400303300404004");
    Person ravil = new Person("Ravil", 24, "040400303300404004");

    List<Person> list = new ArrayList<>();

    list.add(arsen);
    list.add(zhandos);
    list.add(ravil);

    list.sort((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()) );

    for (Person person : list) {
      System.out.println(person);
    }
  }

}

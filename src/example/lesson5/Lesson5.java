package example.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Lesson5 {

  public static void main(String[] args) {



    Parent parent = new Parent("Papa", 50);
    Parent parent2 = new Parent("Mama", 50);
    Arsen arsen = new Arsen("Arsen", 20, "Dvornik");

    Parent[] family = new Parent[]{parent, arsen, parent2};

    for (Parent p : family) {
      System.out.print("Name = " + p.getName() + " Age  = " + p.getAge() + " ");

      if (p instanceof Arsen) {
        System.out.print("profession = " + ((Arsen) p).getProfession());
      }

      System.out.println();
    }
  }
}

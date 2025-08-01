package yernat;

import yernat.hw4.LittleSister;
import yernat.hw4.Sister;
import yernat.hw4.Yernat;
import yernat.hw4.Parent;

public class TurarbekovMain {
    public static void main(String[] args) {

        Parent parent1 = new Parent("Father", 45);
        Parent parent2 = new Parent("Mother", 43);
        Yernat yernat = new Yernat("Yernat", 20, "Software engineer");
        Sister sister = new Sister("Alinaz", 15, 10);
        LittleSister littleSister = new LittleSister("Aknaz", 3, "Barbie");

        Parent[] family = new Parent[]{parent1, parent2, yernat, sister, littleSister};

        for (Parent p : family){
            System.out.print("Name: " + p.getName() + ", Age = "+ p.getAge() + " ");

            if (p instanceof Yernat){
                System.out.print(", Profession: " + ((Yernat) p).getProfession());
            } if (p instanceof Sister){
                System.out.print(", Grade: " + ((Sister) p).getGrade());
            }if (p instanceof LittleSister){
                System.out.println(", Toy: " + ((LittleSister) p).getToy());
            }

            System.out.println();
        }
    }
}
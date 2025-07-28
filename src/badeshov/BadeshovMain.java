package badeshov;

import badeshov.hw4.Brother;
import badeshov.hw4.DOSS;
import badeshov.hw4.Parent;
import badeshov.hw4.Sister;

public class BadeshovMain {
    public static void main(String[] args) {

        Parent parent = new Parent("Dad", 59);
        Parent parent2 = new Parent("Mom", 57);
        DOSS doss = new DOSS("DOSS", 23, "Java");
        Sister sister = new Sister("Aru", 20, "Painting Arts");
        Brother brother = new Brother("Rax", 26, "Master Engineer");

        Parent[] family = new Parent[]{parent, parent2, doss, sister, brother};

        for (Parent p : family) {
            System.out.print(p.toString());

            if (p instanceof DOSS) {
                System.out.print(" ");
                System.out.print(((DOSS) p).getCourse());
            }

            if (p instanceof Sister) {
                System.out.print(" ");
                System.out.print(((Sister) p).getHobby());
            }

            if (p instanceof Brother) {
                System.out.print(" ");
                System.out.print(((Brother) p).getProfession());
            }

            System.out.println();
        }
    }
}
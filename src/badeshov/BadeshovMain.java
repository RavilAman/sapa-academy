package badeshov;

import badeshov.hw4.Brother;
import badeshov.hw4.DOSS;
import badeshov.hw4.Parent;
import badeshov.hw4.Sister;

public class BadeshovMain {
    public static void main(String[] args) {

        Parent parent = new Parent("Erkin", 59);
        System.out.println("Name: " + parent.getName() + "  Age: " + parent.getAge());

        DOSS doss = new DOSS("DOSS", 23, "Java");
        System.out.println("Name: " + doss.getName() + "  Age: " + doss.getAge() + "  Course: " + doss.getCourse());

        Sister sister = new Sister("Aru", 20, "Painting Arts");
        System.out.println("Name " + sister.getName() + "  Age: " + sister.getAge() + "  Hobby: " + sister.getHobby());

        Brother brother = new Brother("Rax", 26, "Master Engineer");
        System.out.println("Name " + brother.getName() + "  Age: " + brother.getAge() + "  Profession: " + brother.getProfession());
    }
}

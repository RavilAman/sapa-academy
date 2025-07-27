package ulykbekova;


import ulykbekova.hw.four.Daughter1;
import ulykbekova.hw.four.Daughter2;
import ulykbekova.hw.four.Mother;
import ulykbekova.hw.four.Parent;

public class MainErke {

    public static void main(String[] args) {

        Parent parent = new Parent("Када", 55);
        Daughter1 erke = new Daughter1("Гулим", 19, "Учитель");
        Daughter2 gul = new Daughter2("Еркежан", 25, "2");
        Mother mama = new Mother("Нургуль", 54, "Камри");

         Parent[] family = new Parent[]{parent, erke, gul, mama};
        for (Parent p : family) {
            System.out.print(p.toString());
            if (p instanceof Daughter1) {
                System.out.print(" профессия = ");
                System.out.print(((Daughter1) p).getProfesion());
            } else if (p instanceof Daughter2) {
                System.out.print(" дети= ");
                System.out.print(((Daughter2) p).getChild());
            } else if (p instanceof Mother) {
                System.out.print(" машина = ");
                System.out.print(((Mother) p).getCar());
            }
            System.out.println();
        }
    }
}

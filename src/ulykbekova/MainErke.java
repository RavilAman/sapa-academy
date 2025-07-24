package ulykbekova;


import ulykbekova.hw.four.Dota1;
import ulykbekova.hw.four.Dota2;
import ulykbekova.hw.four.Mather;
import ulykbekova.hw.four.Parent;

public class MainErke {

    public static void main(String[] args) {

        Parent parent = new Parent("Када", 55);
        Dota1 erke = new Dota1("Гулим", 19, "Учитель");
        Dota2 gul = new Dota2("Еркежан", 25, "2");
        Mather mama = new Mather("Нургуль", 54, "Камри");
        parent.toString();
        Parent[] family = new Parent[]{parent, erke, gul, mama};
        for (Parent p : family) {
            System.out.print(p.toString());
            if (p instanceof Dota1) {
                System.out.print(" профессия = ");
                System.out.print(((Dota1) p).getProfesion());
            } else if (p instanceof Dota2) {
                System.out.print(" дети= ");
                System.out.print(((Dota2) p).getChild());
            } else if (p instanceof Mather) {
                System.out.print(" машина = ");
                System.out.print(((Mather) p).getCar());
            }
            System.out.println();
        }
    }
}

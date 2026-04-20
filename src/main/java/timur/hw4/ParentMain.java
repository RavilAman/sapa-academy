package timur.hw4;

public class ParentMain {
    public static void main (String[] args){

        Parent parent = new Parent("Dad", 48, "Kazakh");
        Parent parent1 = new Parent("Mom", 45,"Kazakh");
        Timur timur =  new Timur("Timur", 20, "Kazakh", "Backend Developer");
        Aldiyar aldiyar = new Aldiyar("Aldiyar", 16, "Kazakh", "Football");
        Sanzhar sanzhar = new Sanzhar("Sanzhar", 12, "Kazakh", "Chess");
        Parent[] family = new Parent[]{parent, parent1, timur, aldiyar, sanzhar};

        for (Parent p: family) {
            System.out.println(p.toString() + " ");

            if (p instanceof Timur){
                System.out.println(((Timur)p).getProfession());
            }else if (p instanceof Aldiyar){
                System.out.print(((Aldiyar)p).getHobbi());
            }else if (p instanceof Sanzhar){
                System.out.print(((Sanzhar)p).getTalante());
            }
        }
    }
}


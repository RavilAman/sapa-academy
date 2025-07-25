package myrzakanov.hw4;

public class MyrzakanovMain2 {
    public static void main(String[] args) {

        Parent parent = new Parent("Papa , ",55);
        Parent parent2 = new Parent("Mama , ",55);
        Me kainar = new Me("Kainar , ", 23, "Ping Pong");
        Twin twin = new Twin("Aidar ,", 23, "Doctor");
        Brother brother = new Brother("Nurtas ,",16, "Vol'naiya bor'ba");

        Parent[] family = new Parent[]{parent, parent2, kainar, twin, brother};

        for(Parent p: family) {
            System.out.print("Name - " + p.getName() + " Age - " + p.getAge());

            if (p instanceof Me) {
                System.out.print(" ");
                System.out.print(", Hobbi - "+((Me) p).getHobbi());
            }
            if(p instanceof Twin){
                System.out.print(" ");
                System.out.print(", Profession - "+(((Twin) p).getProfession()));
            }
            if(p instanceof Brother){
                System.out.print(" ");
                System.out.print(", Sport - " + (((Brother)p).getSport()));
            }
            System.out.println();
        }

    }
}

package yerasyl;

public class Family {
    public static void main(String[] args) {
        Parent[] family={new Parent("adlet", 41),
                new I("Yerasyl", 18,"sdu"),
                new Brother1("Brohter1", 16, "wrestling"),
                new Brother2("Brother2", 12,"football")};
        for (Parent member:family){
            System.out.println("Name:"+ member.getName());
            System.out.println("Age:"+member.getAge());
            if (member instanceof I) {
                ((I) member).getEdu();
            } else if (member instanceof Brother1) {
                ((Brother1) member).getAchieve();
            } else if (member instanceof Brother2) {
                ((Brother2) member).dohobby();
            }
        }
    }
}

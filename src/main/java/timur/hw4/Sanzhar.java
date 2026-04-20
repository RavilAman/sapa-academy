package timur.hw4;

public class Sanzhar extends Parent{

    private String talante;

    public Sanzhar(String name, int age, String nation, String talante){
        super(name, age, nation);
            this.talante = talante;
        }
        public String getTalante(){
            return talante;
        }
    }


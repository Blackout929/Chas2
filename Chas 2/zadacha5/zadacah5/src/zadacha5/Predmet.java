package zadacha5;

public class Predmet {
    public String ime;
    public String profesor;
    public int krediti;
    public String semestar;

    public Predmet () {

    }

    public Predmet (String ime) {
        this.ime = ime;
    }

    public Predmet (String ime, String profesor, int krediti) {
        this.ime = ime;
        this.profesor = profesor;
        this.krediti = krediti;
    }

}
package zadacha4;

public class Avtomobil {
    public String marka;
    public String model;

    public int godina;
    public int kilometraza;

    //Default Constructor
    public Avtomobil () {

    }

    //Dynamic Constructor
    public Avtomobil (String marka, String model, int kilometraza) {
        this.marka = marka;
        this.model = model;
        this.godina = godina;
        this.kilometraza = kilometraza;
    }

    public Avtomobil(String marka, String model, int godina, int kilometraza) {
        this.marka = marka;
        this.model = model;
        this.godina = godina;
        this.kilometraza = kilometraza;
    }
}
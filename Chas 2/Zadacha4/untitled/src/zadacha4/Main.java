package zadacha4;

public class Main {
    public static void main(String[] args) {
        Avtomobil obj1 = new Avtomobil();

        obj1.marka = "Fiat";
        obj1.model = "Grande Punto";
        obj1.godina = 2006;
        obj1.kilometraza = 400000;

        Avtomobil obj2 = new Avtomobil ("BMW","M5",2008,50000);

        System.out.println(obj1.marka + " " + obj1.model + " " + obj1.godina + " " + obj1.kilometraza);
        System.out.println(obj2.marka + " " + obj2.model + " " + obj2.godina + " " +obj2.kilometraza);
    }
}
package oop_prosek_ocenka;

import java.lang.reflect.Array;

class Student extends oop_prosek_ocenka.Chovek {
    public int index;
    public String predmet;
    public double prosek;
    private int[] ocenki;


    public int[] getOcenki() {
        return ocenki;
    }

    public void setOcenki(int[] ocenki) {
        this.ocenki = ocenki;
    }

}





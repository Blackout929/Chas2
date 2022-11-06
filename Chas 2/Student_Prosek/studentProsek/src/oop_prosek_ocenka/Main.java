package oop_prosek_ocenka;

import oop_prosek_ocenka.Chovek;
import oop_prosek_ocenka.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //kod za presmetuvanje na prosek na ocenki
        Scanner ui = new Scanner(System.in);
        Student obj1 = new Student();
        System.out.println("Vnesi go tvoeto ime, prezime i broj na indeks");
        obj1.ime = ui.nextLine();
        obj1.prezime = ui.nextLine();
        obj1.index = ui.nextInt();
        System.out.println("Vnesi gi ocenkite za slednite predmeti:OOP, Algoritmi, Podatochni komunikacii, Sistemski softver, Delovni veshtini");
        int i,S=0;
        int[] grades={};
        for (i=0;i<5;i++ ) {
            grades[i]=ui.nextInt();
            S+=grades[i];
        }

    }
}
package zadacha7;

import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
        Scanner myInput = new Scanner( System.in );
        int a,b;
        double c;

        System.out.println("Vnesi gi stranite na eden pravoagolen triagolnik");
        System.out.println("Vnesi ja stranata a: ");
        a=myInput.nextInt();
        System.out.println("Vnesi ja stranata b: ");
        b=myInput.nextInt();
        c=StrictMath.hypot(a, b);

        Triagolnik obj1 = new Triagolnik (a, b, c);

        System.out.println("Perimetarot na triagolnikot e: " + obj1.Perimetar()+ "cm");
        System.out.println("Plostinata na triagolnikot e: " + obj1.Plostina()+ "cm2");

    }
}
package zadacha7;

public class Triagolnik {
    int a;
    int b;
    double c;

    public Triagolnik (int a, int b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Perimetar () {

        return a+b+c;
    }

    public double Plostina () {

        return (a*b)/2;
    }
}
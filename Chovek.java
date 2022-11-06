public class Chovek {
    private String ImePrezime;

    public Chovek(String imePrezime) {
        ImePrezime = imePrezime;
    }

    public String getImePrezime() {
        return ImePrezime;
    }

    public void setImePrezime(String imePrezime) {
        ImePrezime = imePrezime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
    }
}

class Student extends Chovek{
    protected Ocenka[] o;

    public Student(String imePrezime, Ocenka[] o) {
        super(imePrezime);
        this.o = o;
    }

    public void SetOcenka(Ocenka o){


    }

    public Ocenka[] getO() {
        return o;
    }

    public void setO(Ocenka[] o) {
        this.o = o;
    }


    public float getProsek(){
        float vkupno=0;
        for (int i=0;i<o.length;i++)
        {
            vkupno+=o[i].getOcenka();
        }
        return vkupno/o.length;
    }


    @Override
    public String toString() {
        return "Student{" +
                "o=" + o +
                '}';
    }
}
class Ocenka extends Student{
    private String ImeNaPredmetot;
    private String Datum;
    private Integer Ocenka;

    public Ocenka(String imePrezime, Ocenka[] o, String imeNaPredmetot, String datum, Integer ocenka) {
        super(imePrezime, o);
        ImeNaPredmetot = imeNaPredmetot;
        Datum = datum;
        Ocenka = ocenka;
    }

    public String getImeNaPredmetot() {
        return ImeNaPredmetot;
    }

    public void setImeNaPredmetot(String imeNaPredmetot) {
        ImeNaPredmetot = imeNaPredmetot;
    }

    public String getDatum() {
        return Datum;
    }

    public void setDatum(String datum) {
        Datum = datum;
    }

    public Integer getOcenka() {
        return Ocenka;
    }

    public void setOcenka(Integer ocenka) {
        Ocenka = ocenka;
    }


    @Override
    public String toString() {
        return "Ocenka{" +
                "ImeNaPredmetot='" + ImeNaPredmetot + '\'' +
                ", Datum='" + Datum + '\'' +
                ", Ocenka=" + Ocenka +
                '}';
    }
}


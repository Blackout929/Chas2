package vezhba2;

public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();

        obj1.firstName = "Oliver";
        obj1.lastName = "Peshevski";
        obj1.index = 223;

        System.out.println("Податоци за прв објект:");
        System.out.println(obj1.firstName + " " + obj1.lastName + " " + obj1.index);

        Student obj2 = new Student("Stefani", "Angelovska", 305);

        System.out.println ("Податоци за втор објект:");
        System.out.println (obj2.firstName + " " + obj2.lastName + " " + obj2.index);
    }
}
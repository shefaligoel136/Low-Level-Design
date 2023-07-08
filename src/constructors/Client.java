package constructors;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        Student st1 = new Student("Shefali", 24);

        Student st2 = new Student(st1);

        System.out.println("DEBUG" + " "+ st);

    }
}

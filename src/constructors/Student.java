package constructors;

public class Student {
    private String name;
    public int age;
    double psp;
    protected int batchId;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

//    if we have custom constructor - we will have to define the default constructor.
    public Student(){}


}

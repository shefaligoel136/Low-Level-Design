package DesignPatterns.Prototype;

public class Client {

    public static void fillRegistry(StudentRegistry registry){
        Student batch23prototype = new Student();
        batch23prototype.setBatchName("YEAR-2023");
        batch23prototype.setAvgBatchPSP(98.7);

        registry.registry("2023",batch23prototype);

        IntellijStudent ye2023IS = new IntellijStudent();
        ye2023IS.setBatchName("YEAR-2023");
        ye2023IS.setAvgBatchPSP(98.7);

        registry.registry("2023IntelStudent", ye2023IS);
    }

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student st1 = registry.get("2023").clone();
        st1.setName("Shefali");
        st1.setAge(24);
        st1.setPsp(99);

        Student st2 = registry.get("2023").clone();
        st2.setName("Goel");
        st2.setAge(23);
        st2.setPsp(98);

        Student is1 = registry.get("2023IntelStudent").clone();
        st2.setName("Shefali Goel");
        st2.setAge(24);
        st2.setPsp(100);
//
//        IntellijStudent intellijStudent = (IntellijStudent) registry.get("Sept22Intellijent").clone();
//        intellijStudent.setIq(120);

        System.out.println("DEBUG");
    }
}

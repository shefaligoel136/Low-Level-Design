package DesignPatterns.Prototype;

public class Student implements Prototype<Student>{

    private String name;
    private int age;
    private double psp;
    private String batchName;
    private double avgBatchPSP;

    public Student(){}

    public Student(Student student) {
        this.avgBatchPSP = student.avgBatchPSP;
        this.batchName = student.batchName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setAvgBatchPSP(double avgBatchPSP) {
        this.avgBatchPSP = avgBatchPSP;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public double getAvgBatchPSP() {
        return avgBatchPSP;
    }

    @Override
    public Student clone() {
//        Student stCopy = new Student();
//        stCopy.avgBatchPSP = this.avgBatchPSP;
//        stCopy.batchName = this.batchName;
//        return stCopy;
        return new Student(this);
    }


}

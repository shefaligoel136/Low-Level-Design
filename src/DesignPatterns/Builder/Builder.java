package DesignPatterns.Builder;

public class Builder {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public long getId() {
        return id;
    }

    public Builder setId(long id) {
        this.id = id;
        return this;
    }

    public int getGradYear() {
        return gradYear;
    }

    public Builder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

//    public Student build(){
//        return new Student(this);
//    }
}
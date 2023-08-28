package DesignPatterns.Prototype;

public class IntellijStudent extends Student{
    private int iq;

    public IntellijStudent(){}

    public IntellijStudent(IntellijStudent its){
        super(its);
        this.iq = its.iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntellijStudent clone(){
//        IntellijStudent its = new IntellijStudent();
//        its.setAvgBatchPSP(this.getAvgBatchPSP());
//        its.setBatchName(this.getBatchName());
//
//        return its;

//        super.clone();

        return new IntellijStudent(this);
    }
}

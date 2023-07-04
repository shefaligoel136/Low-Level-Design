package accessModifiersTesting;

import accessModifiers.Student;

public class StudentChild extends Student {
    public static void main(String[] args) {

        //        ------------1--------
        Student st = new Student();
        st.age = 24;
        // st.name = 'shefali'; // compile time error
        // st.psp = 90.8; // 'psp' is not public in 'accessModifiers.Student'. Cannot be accessed from outside package
        // st.batchId = "s"; // 'batchId' has protected access in 'accessModifiers.Student'


        //        ------------2---------
        StudentChild sc = new StudentChild();
        sc.batchId = 2;
        // Protected data members can be accessed within the child class outside the package, via object of child class

    }
}

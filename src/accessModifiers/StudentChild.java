package accessModifiers;

public class StudentChild extends Student{
    public static void main(String[] args) {
        Student st = new Student();
        //        st.name = 'shefali'; // compile time error
        st.age = 24;
    }
}

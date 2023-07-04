package oops1;

// new keyword -> allocates new space in the memory
// Student() -> constructor - special method.

public class Client {

    public static void main(String[] args) {
        //    creating object
        Student st = new Student();
        st.name = "Shefali";
        st.age = 24;
        System.out.println("DEBUG");
    }
}

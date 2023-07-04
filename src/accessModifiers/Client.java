package accessModifiers;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        constructors.Student newC = new constructors.Student();
//        st.name = 'shefali'; // compile time error
    }
}

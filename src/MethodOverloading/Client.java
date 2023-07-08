package MethodOverloading;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();

        st.hello();
        st.hello("Shefali");
        st.hello(null);
        st.hello(st);
    }
}

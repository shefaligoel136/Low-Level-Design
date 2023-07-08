package MethodOverriding;

public class Client {
    public static void main(String[] args) {
        A a1 = new A();
        a1.doSomething("do 1");

        A a2 = new B();
        a2.doSomething("do 2");

//        a2.valB is not possible -> typecast it ((B) a2).valB = 1;

        B b1  = new B();
        b1.doSomething("do 3");

//        B b2 = new A();


    }
}

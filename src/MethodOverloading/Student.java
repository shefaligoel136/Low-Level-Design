package MethodOverloading;

public class Student {
    String name;
    int age;

    void hello(String name){
        System.out.println("Hello String");
    }

    void hello(Object s){
        System.out.println("Hello Object");
    }

    void hello(){
        System.out.println("hello");
    }
}

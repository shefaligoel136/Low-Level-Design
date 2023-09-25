package Lambdas.Demo;

@FunctionalInterface
public interface IDemo{
    void fn();

    // this method is there in object class, and it is getting implemeted internally, hence not creating any error.
//    String toString();
}
package Interface;

public interface Animal {

    // 1. Interface can only have static final attributes. -
    // ---static because w/o object you will be able to access it and final so that value does not changes
    // 2. All methods and attributes are public by default.
    void eat();
    void walk();
    void run();

//    JAVA 8: default methods in interface.

    default void sleep(){
        /* implementation of method */
        System.out.println("ANIMAL IS SLEEPING");
    }
}

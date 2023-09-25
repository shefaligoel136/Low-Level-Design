package Lambdas.Basic;


public class Client {
    public static void main(String[] args) {

        //      1. Part 1 : implementation but as a programmer we should be focusing on logic:
        ISimple demo1  = ( /* parameters */ ) -> {
            System.out.println("HELLO SIMPLE WORLD part 1");
        };
        demo1.show();

        //      2. Part 2 : implementation
        ISimple demo2  = ( /* parameters */ ) -> System.out.println("HELLO SIMPLE WORLD part 2");
        demo2.show(); // call it.
    }
}

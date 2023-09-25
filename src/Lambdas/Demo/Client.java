package Lambdas.Demo;

public class Client {
    public static void main(String[] args) {
        IDemo demo1 = new IDemo() {
//            ANONYMOUS INNER CLASS
            @Override
            public void fn() {
                System.out.println("I AM IMPLEMENTED BY CREATING A OBJECT OF INTERFACE, " +
                        "FOR ME NO OBJECT IS CREATED USING ANOTHER CLASS");
            }
        };

        demo1.fn();

    }
}

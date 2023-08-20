package Threads.SeperateThreads;

public class Client {
    public static void main(String[] args) {

//        1....
//        System.out.println("Hello1 from Main class " + Thread.currentThread().getName());
//
//        DemoPrinter dp1 = new DemoPrinter();
//        dp1.run();
//
//        System.out.println("Hello2 from Main class " + Thread.currentThread().getName());

//        2....

        System.out.println("Hello1 from Main class " + Thread.currentThread().getName());

        DemoPrinter dp1 = new DemoPrinter();
        Thread t1 = new Thread(dp1);
        t1.start();

        System.out.println("Hello2 from Main class " + Thread.currentThread().getName());


    }
}

package Threads.AdderSubtractorNoSync;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        counter.value = 0;

//        int count = 0; // in stack - primitive type - local to main function
//        count of adder and sub are in heap - having diff address (call by value)
//        Adder adder = new Adder(count);
//        Subtractor subtractor = new Subtractor(count);

        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);

//        adder.run();
//        subtractor.run();

        Thread t1 = new Thread(adder);
        t1.start();

        Thread t2 = new Thread(subtractor);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("count" + " " + counter.value);
    }
}

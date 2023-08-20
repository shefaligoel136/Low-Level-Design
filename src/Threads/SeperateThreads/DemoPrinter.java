package Threads.SeperateThreads;

public class DemoPrinter implements Runnable{

    private void doSomething(){
        System.out.println("Hello2 from DemoPrinter " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Hello1 from DemoPrinter " + Thread.currentThread().getName());
        doSomething();
    }
}

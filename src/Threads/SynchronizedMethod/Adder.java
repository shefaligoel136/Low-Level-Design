package Threads.SynchronizedMethod;


public class Adder implements Runnable{
    Counter counter;

    Adder(Counter counter){
        this.counter = counter;

    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            this.counter.incValue(+i);
        }
    }
}

package Threads.SynchronizedBlock;


public class Adder implements Runnable{
    Counter counter;

    Adder(Counter counter){
        this.counter = counter;

    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (counter) {
                this.counter.value += i;
            }
        }
    }
}

package Threads.Locks;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Counter counter;
    Lock lock;
    Adder(Counter counter, Lock lock){
        this.counter = counter;
        this.lock = lock;
    }
    @Override
    public void run() {
//        lock.lock();
        for(int i=0;i<10000;i++) {
            lock.lock();
            this.counter.value += i;
            lock.unlock();
        }
//        lock.unlock();
    }
}

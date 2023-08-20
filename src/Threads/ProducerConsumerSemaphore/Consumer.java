package Threads.ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{

    Queue<Object> store;
    int maxSize;

    String name;

    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Lock lock;

    Consumer(Queue<Object> store, int maxSize, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore, Lock lock){
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.lock = lock;
    }

    @Override
    public void run() {
        while(true){ // infinite number of consumer
            synchronized (store){
                try {
                    consumerSemaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
//                lock.lock();
//                if(store.size() > 0){
                    store.remove();
                    System.out.println("Consumer" + " " + name + " " + "consumed the object, now the current size of store is" + " " + store.size());
//                }
//                lock.unlock();
                producerSemaphore.release();
            }
        }
    }
}

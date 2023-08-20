package Threads.ProducerConsumer;

import java.util.Queue;

public class Consumer implements Runnable{

    Queue<Object> store;
    int maxSize;

    String name;

    Consumer(Queue<Object> store, int maxSize, String name){
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while(true){ // infinite number of consumer
            synchronized (store){
                if(store.size() > 0){
                    System.out.println("Consumer" + " " + name + " " + "is consuming the object, now the current size of store is" + " " + store.size());
                    store.remove();
                }
            }
        }
    }
}

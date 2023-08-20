package Threads.ProducerConsumer;

import java.util.Queue;

public class Producer implements Runnable{

    Queue<Object> store;
    int maxSize;

    String name;

    Producer(Queue<Object> store, int maxSize, String name){
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while(true){ // infinite number of producers
            synchronized (store){
                if(store.size() < maxSize){
                    System.out.println("Produce" + " " + name + " " + "is adding the object, now the current size of store is" + " " + store.size());
                    store.add(new Object());
                }
            }
        }
    }
}

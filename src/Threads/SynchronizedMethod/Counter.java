package Threads.SynchronizedMethod;

public class Counter {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void incValue(int offSet){
        this.value += offSet;
    }
}

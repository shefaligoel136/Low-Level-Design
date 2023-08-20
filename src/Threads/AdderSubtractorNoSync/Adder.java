package Threads.AdderSubtractorNoSync;

public class Adder implements Runnable{

//    int count;
//
//    Adder(int count){
//        this.count = count;
//    }

    Counter counter;
    Adder(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            this.counter.value += i;
        }
    }
}

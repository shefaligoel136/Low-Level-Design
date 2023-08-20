package Threads.AdderSubtractorNoSync;

public class Subtractor implements Runnable{

//    int count;
//
//    Subtractor(int count){
//        this.count = count;
//    }

    Counter counter;
     Subtractor(Counter counter){
         this.counter = counter;
     }

    @Override
    public void run() {
        for(int i=0;i<10000;i++) {
            this.counter.value -= i;
        }
    }
}

package Threads.Callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class GreetingsGenerator implements Callable<String> {
    private Random random;

    GreetingsGenerator(Random random){
        this.random = random;
    }
    @Override
    public String call() throws Exception {
        int num = random.nextInt(5);

        if(num == 1){
            return "Hello! from" +" "+Thread.currentThread().getName();
        } else if (num == 2) {
            return "Hi! from" +" "+Thread.currentThread().getName();
        } else if (num == 3) {
            return "Namaste! from" +" "+Thread.currentThread().getName();
        }else if (num == 4){
            return "Hola! from" +" "+Thread.currentThread().getName();
        }else if(num == 5){
            return "Hey! from" +" "+Thread.currentThread().getName();
        }else{
            return "No Greetings!! from" +" "+Thread.currentThread().getName();
        }
    }
}

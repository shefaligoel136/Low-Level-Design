package Threads.Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random r = new Random();
        GreetingsGenerator gg = new GreetingsGenerator(r);

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<String>> listFutureGreetings = new ArrayList<>();

        for(int i = 1;i<=100;i++){
            Future<String> promiseOfGreetings = executorService.submit(gg);
            listFutureGreetings.add(promiseOfGreetings);
        }

        for(Future<String> greetingPromise: listFutureGreetings){
            String greeting = greetingPromise.get();
            System.out.println(greeting);
        }

        executorService.shutdown();
    }
}

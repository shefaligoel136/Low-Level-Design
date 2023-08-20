package Threads.ThreadPoll;

import Threads.Print1ToN.NumberPrinter;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=1;i<=n;i++){
            NumberPrinter np = new NumberPrinter(i);
            executorService.execute(np);
        }

        System.out.println("Bye From" + " " + Thread.currentThread().getName());
        executorService.shutdown();
    }
}

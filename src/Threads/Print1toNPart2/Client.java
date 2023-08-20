package Threads.Print1toNPart2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();

        NumberPrinter np = new NumberPrinter(1);
        for(int i=1;i<=n;i++){
            Thread t = new Thread(np);
            t.start();
        }

        System.out.println("Bye From" + " " + Thread.currentThread().getName());
    }
}

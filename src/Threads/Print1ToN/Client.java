package Threads.Print1ToN;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
//          NOTE: The numbers will be printed in any order, because each number is assigned to a different thread
//          now, it is now based on cpu scheduling to decide.

            NumberPrinter np = new NumberPrinter(i);
            Thread t = new Thread(np);
            t.start();
        }

        System.out.println("Bye From" + " " + Thread.currentThread().getName());
    }
}

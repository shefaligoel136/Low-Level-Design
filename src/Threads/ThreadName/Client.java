package Threads.ThreadName;

public class Client {
    public static void main(String[] args) {
        System.out.println("Thread from main has name --->" + " " + Thread.currentThread().getName());
    }
}

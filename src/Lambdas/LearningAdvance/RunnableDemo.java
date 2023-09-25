package Lambdas.LearningAdvance;

public class RunnableDemo {
    public static void main(String[] args) {

//        1st IMPLEMENTATION - ANONYMOUS
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1" + " " + Thread.currentThread().getName());
            }
        };
        System.out.println("Global.." +" "+ Thread.currentThread().getName());
        Thread t1 = new Thread(runnable1);
        t1.start();

//        2nd IMPLEMENTATION - USING LAMBDA

        Runnable runnable2 = () -> {
            System.out.println("Inside Runnable 2" + " " + Thread.currentThread().getName());
        };
        Thread t2 = new Thread(runnable2);
        t2.start();

//      3rd IMPLEMENTATION - USING LAMBDA PRECISE

        Thread t3 = new Thread(() -> System.out.println("Inside Runnable 2" + " " + Thread.currentThread().getName()));
        t3.start();



    }
}

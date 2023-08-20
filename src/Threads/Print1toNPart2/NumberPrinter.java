package Threads.Print1toNPart2;

public class NumberPrinter implements Runnable{
    private int numberToPrint;

    public NumberPrinter(int numberToPrint){
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println(numberToPrint + " " + "Printed by" + " " + Thread.currentThread().getName());
//        ++numberToPrint;
        numberToPrint++;
    }
}

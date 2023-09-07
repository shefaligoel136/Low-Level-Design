package DesignPatterns.Strategy;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String fromLocatiom, String toLocation) {
        System.out.println("CAR PATH");
    }
}

package DesignPatterns.Strategy;

public class BikePathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String fromLocatiom, String toLocation) {
        System.out.println("BIKE PATH");
    }
}

package DesignPatterns.Strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String fromLocatiom, String toLocation) {
        System.out.println("WALK PATH");
    }
}

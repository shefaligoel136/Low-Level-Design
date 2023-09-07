package DesignPatterns.Strategy;

import MethodOverriding.B;

public class PathCalculatorFactory {

//    EAGER INITIALIZATION

    private static CarPathCalculator carPathCalculator = new CarPathCalculator();
    private static BikePathCalculator bikePathCalculator = new BikePathCalculator();
    private static WalkPathCalculator walkPathCalculator  = new WalkPathCalculator();
    public static PathCalculatorStrategy getPathCalculatorForMode(String mode){
        if(mode.equals("Car")){
//            return new CarPathCalculator();
            return carPathCalculator;
        }else if(mode.equals("Bike")){
            return bikePathCalculator;
        }else{
            return walkPathCalculator;
        }
    }
}

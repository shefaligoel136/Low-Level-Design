package DesignPatterns.Decorator;

public class OrangeCone implements IceCream{
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}

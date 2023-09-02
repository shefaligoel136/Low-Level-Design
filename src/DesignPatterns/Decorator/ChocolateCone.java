package DesignPatterns.Decorator;

public class ChocolateCone implements IceCream{

//    Chocolate cone can act as base as well as addon.

    private IceCream iceCream;

    public ChocolateCone(){}

    public ChocolateCone(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 30;
        }

        return 30;
    }

    @Override
    public String getDescription() {
        if(iceCream != null){
            return iceCream.getDescription() + " + Chocolate Cone";
        }

        return "Chocolate Cone";
    }
}

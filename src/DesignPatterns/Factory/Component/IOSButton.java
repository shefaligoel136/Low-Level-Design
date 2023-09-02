package DesignPatterns.Factory.Component;

public class IOSButton implements Button{
    @Override
    public void showButton() {
        System.out.println("IOS Button.");
    }
}

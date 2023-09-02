package DesignPatterns.Factory.Component;

public class AndroidButton implements Button{

    @Override
    public void showButton() {
        System.out.println("Android Button");
    }
}

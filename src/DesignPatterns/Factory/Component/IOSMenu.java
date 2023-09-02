package DesignPatterns.Factory.Component;

public class IOSMenu implements Menu{
    @Override
    public void showMenu() {
        System.out.println("IOS Menu");
    }
}

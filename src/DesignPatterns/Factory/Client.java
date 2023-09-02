package DesignPatterns.Factory;

import DesignPatterns.Factory.Component.Button;
import DesignPatterns.Factory.Component.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createFactory(SupportedPlatform.ANDROID);

        Button button = uiFactory.createButton();
        button.showButton();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}

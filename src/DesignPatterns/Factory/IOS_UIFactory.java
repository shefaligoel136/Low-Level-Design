package DesignPatterns.Factory;

import DesignPatterns.Factory.Component.Button;
import DesignPatterns.Factory.Component.IOSButton;
import DesignPatterns.Factory.Component.IOSMenu;
import DesignPatterns.Factory.Component.Menu;

public class IOS_UIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}

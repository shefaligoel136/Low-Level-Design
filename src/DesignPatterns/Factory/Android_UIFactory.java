package DesignPatterns.Factory;

import DesignPatterns.Factory.Component.AndroidButton;
import DesignPatterns.Factory.Component.AndroidMenu;
import DesignPatterns.Factory.Component.Button;
import DesignPatterns.Factory.Component.Menu;

public class Android_UIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}

package DesignPatterns.Factory;

import DesignPatterns.Factory.Component.Button;
import DesignPatterns.Factory.Component.Menu;

public interface UIFactory {
//    This interface should only contain the factory method.
//    FACTORY METHOD:- That returns an object of corresponding class.

    Button createButton(); // Factory Method

    Menu createMenu();

}

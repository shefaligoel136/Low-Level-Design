package Interface;

public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("DOG IS EATING");
    }

    @Override
    public void walk() {
        System.out.println("DOG IS WALKING");
    }

    @Override
    public void run() {
        System.out.println("DOG IS RUNNING");
    }

    public void bark(){
        System.out.println("DOG BARKS");
    }

    public void sleep(){
        System.out.println("DOG IS SLEEPING");
    }
}

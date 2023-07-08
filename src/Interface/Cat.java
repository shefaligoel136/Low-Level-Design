package Interface;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("CAT IS EATING");
    }

    @Override
    public void walk() {
        System.out.println("CAT IS WALKING");
    }

    @Override
    public void run() {
        System.out.println("CAT IS RUNNING");
    }

    public void meow(){
        System.out.println("CAT MEOWS");
    }
}

package Interface;

public class Client {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.sleep();

        animal = new Cat();
        animal.eat();
        animal.sleep();
    }
}

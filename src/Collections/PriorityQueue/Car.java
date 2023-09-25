package Collections.PriorityQueue;

public class Car implements Comparable<Car>{
    int speed;
    int power;

    String name;

    Car(int speed, int power, String name){
        this.speed = speed;
        this.power = power;
        this.name = name;
    }

    @Override
    public int compareTo(Car o) {
        return o.speed - this.speed;
    }
}

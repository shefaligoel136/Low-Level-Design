package Collections.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(7);
        pq.add(20);
        pq.add(12);

        while(pq.size() > 0){
            System.out.println(pq.poll());
        }

        PriorityQueue<Car> pqCar = new PriorityQueue<>();
        pqCar.add(new Car(100, 78, "A"));
        pqCar.add(new Car(200, 100, "B"));
        pqCar.add(new Car(150, 780, "C"));
        pqCar.add(new Car(400, 20, "D"));
        pqCar.add(new Car(70, 150, "E"));
        pqCar.add(new Car(175, 200, "F"));


        while(pqCar.size() > 0){
            System.out.println(pqCar.peek() + " " + pqCar.peek().speed + " " + pqCar.peek().power + " " + pqCar.peek().name);
            pqCar.poll();
        }

        PriorityQueue<Car> pqCar1 = new PriorityQueue<>(new CarPowerComparator());

        PriorityQueue<Car> pqCar2 = new PriorityQueue<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if(o1.speed == o2.speed){
                    return o1.power - o2.power;
                }else{
                    return o1.speed - o2.speed;
                }
            }
        });

        PriorityQueue<Car> pqCar3 = new PriorityQueue<>((Car o1, Car o2) -> {
                if(o1.speed == o2.speed){
                    return o1.power - o2.power;
                }else {
                    return o1.speed - o2.speed;
                }
        });


    }
}

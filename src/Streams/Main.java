package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,5,2,8,1,7);

        Stream<Integer> data = nums.stream();

        Stream<Integer> mappedData = data.map(n -> n*2);

        mappedData.forEach(n -> System.out.println(n));

        System.out.print("-------" + '\n');

//      NOTE: 3 streams are created here - but since it gets cleared, so not actually the space is getting wasted
        nums.stream()
                .map(n->n*n)
                .forEach(n -> System.out.println(n));

        System.out.print("-------" + '\n');


        nums.stream()
                .filter(n -> (n%2) == 1) // 5,7 - predicate
                .map(n -> n*2) // 10, 14
                .forEach(n -> System.out.println(n));

        Predicate<Integer> predicate = n -> n%2 == 1;

        System.out.print("-------" + '\n');

        int value = nums.stream()
                .filter(n -> (n%2) == 1) // 5,7 - predicate
                .map(n -> n*2) // 10, 14
                .reduce(0,(v,a) -> v+a); // 0 is the identity, the starting value

        System.out.println(value);



        /*        System.out.println(data);
                  data = data.sorted();
                  System.out.println(data);
         */

    }
}

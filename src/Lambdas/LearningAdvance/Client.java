package Lambdas.LearningAdvance;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Client {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer integer) -> System.out.println(integer);
        consumer.accept(20);

        BiConsumer<Integer, Integer> biConsumer = (Integer i1, Integer i2) -> System.out.println(i1+i2);
        biConsumer.accept(10,10);

        BiFunction<Integer, String, String> biFunction = (val, str) -> {

//            1nd Integer, 2nd String - argument types.
//            3rd String - return type

            if(str.length() > val){
                return "String length is greater than val";
            }else{
                return "String length is less than val";
            }
        };

        biFunction.apply(5,"Shefali");

    }
}

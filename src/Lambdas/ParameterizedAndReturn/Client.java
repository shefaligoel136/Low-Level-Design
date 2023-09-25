package Lambdas.ParameterizedAndReturn;

public class Client {
    public static void main(String[] args) {
        IParameterizedAndReturn IParameterizedAndReturn = (int n1, int n2) -> n1 + n2;

        System.out.println(IParameterizedAndReturn.sum(10,10));
    }
}

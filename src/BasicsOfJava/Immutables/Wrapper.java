package BasicsOfJava.Immutables;

public class Wrapper {

    public static void modify(Integer val){
        val = val + 100;
        System.out.println(val);
    }

    public static void main(String[] args) {
        Integer i = 10;
        Character c = 'a';

        Integer val = 20;
        Integer i1 = val;

        modify(val);

        System.out.println(val);
        System.out.println(i1);
    }
}

package BasicsOfJava;

public class StaticDemo {
    public static void main(String[] args){

        StaticDemo sdn = new StaticDemo();

        StaticDemo sdn1 = new StaticDemo();


        System.out.println(sdn.count);
        System.out.println(sdn1.count);
        System.out.println(StaticDemo.count);
        StaticDemo.opsonStatic.print();

    }

    static int count=0;// count of objects
    String Name;



    StaticDemo(){
        count++;
    }

    static class opsonStatic{


        static void print(){
            System.out.println(count);
        }
    }
}

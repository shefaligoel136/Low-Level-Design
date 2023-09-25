package BasicsOfJava.DataTypes;

public class DataType {
    public static void main(String[] args) {
        byte b = 127;
        b = (byte)(b+1);
        System.out.println(b);

        String s   = "test";

        System.out.println(s.getClass().getSimpleName());

    }
}

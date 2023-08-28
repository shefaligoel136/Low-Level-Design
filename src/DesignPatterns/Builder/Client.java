package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Shefali Goel");
        builder.setAge(24);
        builder.setPsp(99.0);
        builder.setGradYear(2023);

        Student student = new Student(builder);

        Student builderStudent = Builder.getBuilder().setName("Shefali").setAge(24).setGradYear(2022).build();
    }
}

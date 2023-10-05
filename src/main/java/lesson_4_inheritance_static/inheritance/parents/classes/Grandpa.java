package lesson_4_inheritance_static.inheritance.parents.classes;

public class Grandpa {
    private String name;
    private static String hello = "i am grandpa";
    static {
        System.out.println(hello);
    }

    public Grandpa(String name) {
        this.name = name;
        System.out.println(
                hello + " " + name
        );
    }

    public String getName() {
        return name;
    }

    public static String getHello() {
        return hello;
    }
}

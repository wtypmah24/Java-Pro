package lesson_4_inheritance_static.inheritance.parents.classes;

public class Father extends Grandpa {
    private String job;
    private static String fatherHello = "I am father";

    static {
        System.out.println(fatherHello);
    }

    public Father(String name, String job) {
        super(name);
        this.job = job;
        System.out.println(
                fatherHello + " " + name + " " + job
        );
    }

    public String getJob() {
        return job;
    }

    public String getFatherHello() {
        return fatherHello;
    }
}


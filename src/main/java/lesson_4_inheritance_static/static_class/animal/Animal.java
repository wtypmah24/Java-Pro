package lesson_4_inheritance_static.static_class.animal;

public class Animal {
    //создать класс животные с 3мя полями
    //создать статик поля для животных и статик методы
    //создать статический блок инициализации
    //вывести в консоль сообщение при любой инициализации поля

    private static Animal cow = new Animal("Cow", false, "white");
    static {
        System.out.println("static Init begin");
        System.out.println(cow);
        cow = new Animal("Bull", false, "black");
        System.out.println(cow);
        System.out.println("static init finsh");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", isPredator=" + isPredator +
                ", color='" + color + '\'' +
                '}';
    }

    private String type;
    private boolean isPredator;
    private String color;
    {
        System.out.println("init begin");
        System.out.println(this);
        type = "Lion";
        isPredator = true;
        color = "Golden";
        System.out.println(this);
        System.out.println("init finish");
    }

    public Animal(String type, boolean isPredator, String color) {
        System.out.println("contr begin");
        this.type = type;
        this.isPredator = isPredator;
        this.color = color;
        System.out.println(this);
        System.out.println("constr finish");
    }

    public String getType() {
        return type;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public String getColor() {
        return color;
    }

    public static Animal getCow() {
        return cow;
    }
}

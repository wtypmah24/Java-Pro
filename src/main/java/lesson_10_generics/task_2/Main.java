package lesson_10_generics.task_2;

public class Main {
    /*
     * 2 Создайте параметризированный метод, который принимает два параметра одного типа –
     * значение и значение по умолчанию. Метод возвращает значение, если оно не равно null.
     * В противном случае – возвращает значение по умолчанию.
     * */
    private static <T> T getOrDefault(T value, T defaultValue) {
        return value != null ? value : defaultValue;
    }

    private static <V> String concat(V value, String s) {
        return s + value;
    }

    public static void main(String[] args) {
        System.out.println(getOrDefault(777, 444));
        System.out.println(getOrDefault(null, 444));
        System.out.println(getOrDefault(null, "Hello world"));
        System.out.println(getOrDefault("null", "Hello world"));
        System.out.println(concat(44, "hello"));
    }
}

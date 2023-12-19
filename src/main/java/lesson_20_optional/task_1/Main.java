package lesson_20_optional.task_1;

import java.util.Optional;

public class Main {
    /*
    * 1 Создайте метод, который принимает объект и возвращает его строковое представление.
    * Используйте Optional для предотвращения NullPointerException, если переданный объект равен null.
    2 Создайте метод, который возвращает Optional для строки.
    * Если строка начинается с буквы "A", верните её значение, иначе верните Optional.empty().
    3 Создайте метод, который принимает Optional и возвращает его значение,
    * или строку "Default", если значение отсутствует.
    4 Создайте метод, который принимает два Optional и возвращает их сумму.
    * Если хотя бы одно из значений отсутствует, верните Optional.empty().
    5 Создайте метод, который принимает Optional для строки и возвращает Optional
    * для длины этой строки. Если входная строка null, бросьте IllegalArgumentException.*/
    public static void main(String[] args) {
        System.out.println("1st task");
        System.out.println(toStr("vfdgbgdfb").orElse("received null"));
        System.out.println(toStr(null).orElse("received null"));

        System.out.println("------------------------------");
        System.out.println("2nd task");

        System.out.println(getStringIfStartsWithA("ABC").orElse("Default value"));
//        System.out.println(getStringIfStartsWithA("gbvf").orElseThrow());

        System.out.println("------------------------------");
        System.out.println("3rd task");

        System.out.println(getMsgOrDefault(Optional.of("hello")));
//        System.out.println(getMsgOrDefault(null));

        System.out.println("------------------------------");
        System.out.println("4th task");

        System.out.println(getSum(Optional.of(12), Optional.of(4)));

        System.out.println("------------------------------");
        System.out.println("5th task");

        System.out.println(getStrLength(Optional.of("gvsbdjhcsbdfkjn")));
        System.out.println(getStrLength(Optional.ofNullable(null)));
    }

    private static Optional<String> toStr(Object obj) {
        return obj == null ? Optional.empty() : Optional.of(obj.toString());
    }

    private static Optional<String> getStringIfStartsWithA(String str) {
        return str != null && str.startsWith("A") ? Optional.of(str) : Optional.empty();
    }

    private static String getMsgOrDefault(Optional<String> optional){
        return optional.orElse("Default");
    }

    private static Optional<Integer> getSum(Optional<Integer> op1, Optional<Integer> op2){
        return op1.isEmpty() || op2.isEmpty() ? Optional.empty() : Optional.of(op1.get() + op2.get());
    }

    private static Optional<Integer> getStrLength(Optional<String> str){
        return Optional.of(str.orElseThrow(() -> new IllegalArgumentException("null str")).length());
    }
}
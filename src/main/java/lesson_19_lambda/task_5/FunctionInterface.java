package lesson_19_lambda.task_5;

import java.util.function.*;

public class FunctionInterface {
    /*
    * s -> System.out.println(s);
    x -> x*x;
    s -> s == null || s.isBlank();
    (age, name) -> System.out.printf("%s is %d years old", name, age);
    (a, b) -> a + b;
    (s1, s2) -> s1 != null && s2 != null && s1.length() > s2.length();*/

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");

        UnaryOperator<Integer> unaryOperator = x -> x*x;
        System.out.println(unaryOperator.apply(5));

        Predicate<String> predicate = s -> s == null || s.isBlank();
        System.out.println(predicate.test("Hallo"));

        BiConsumer<Integer, String> biConsumer = (age, name) -> System.out.printf("%s is %d years old", name, age);
        biConsumer.accept(13, "Gleb");

        BinaryOperator<Integer> operator1 = Integer::sum;
        BinaryOperator<String> operator2 = (a, b) -> a + b;
        System.out.println(operator1.apply(4, 5));
        System.out.println(operator2.apply("H", "ello"));

        BiPredicate<String, String> biPredicate = (s1, s2) -> s1 != null && s2 != null && s1.length() > s2.length();
        System.out.println(biPredicate.test("Hfbfgdbfdgb", "fdbdfgb"));


    }
}

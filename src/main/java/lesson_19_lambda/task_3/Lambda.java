package lesson_19_lambda.task_3;

import java.util.List;

public class Lambda {
    /*
     * Создайте 3 лямбда-выражения, которые выводят строку в консоль
     * разными способами. Передайте все лямбда-выражения в
     * метод в виде коллекции и выведите все строки в консоль.*/
    public static void main(String[] args) {
        Runnable print1 = () -> System.out.println("hello from first print");
        Runnable print2 = () -> System.out.printf("hello from %d print \n", 2);
        Runnable print3 = () -> System.err.println("Error from print 3");

        printAll(List.of(print1, print2, print3));
    }
    private static void printAll(List<Runnable> input) {
        input.forEach(Runnable::run);
    }
}
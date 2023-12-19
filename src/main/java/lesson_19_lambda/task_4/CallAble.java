package lesson_19_lambda.task_4;

import java.util.concurrent.Callable;

public class CallAble {
    /*
    * Напишите методы для вычисления суммы, разности, произведения и частного двух чисел.
    Создайте метод calculate, который будет возвращать результат вычисления, принимая в
    * качестве параметра экземпляр Callable. Перед вычислением метод должен выводить сообщение
    * «Выполняю вычисление», а после вычисления – «Вычисление выполнено».

    Организуйте ввод пользователя: два числа и оператор. Программа должна вывести результат в консоль и в файл.*/
    public static void main(String[] args) {
        Callable<Integer> sum = () -> getSum(2, 4);
        Callable<Integer> multiply = () -> getMultiply(2, 4);
        Callable<Integer> divide = () -> getDivide(2, 4);
        Callable<Integer> diff = () -> getDifferance(2, 4);

        System.out.println(calculate(sum));
        System.out.println(calculate(multiply));
        System.out.println(calculate(divide));
        System.out.println(calculate(diff));

    }

    private static int getSum(int a, int b) {
        return a + b;
    }

    private static int getMultiply(int a, int b) {
        return a * b;
    }

    private static int getDivide(int a, int b) {
        return a / b;
    }

    private static int getDifferance(int a, int b) {
        return a - b;
    }

    private static int calculate(Callable<Integer> operation) {
        System.out.println("Выполняю вычисление");
        int result = 0;
        try {

            result = operation.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Вычисление выполнено");
        return result;
    }
}

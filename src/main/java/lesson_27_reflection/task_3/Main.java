package lesson_27_reflection.task_3;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    /*
    Создайте метод, который принимает переменную типа List.
    Выведите описание всех методов переданного списка. В main вызовите метод, передав в него
    экземпляр ArrayList
    экземпляр LinkedList
    экземпляр, полученный методом List.of().*/

    public static void main(String[] args) {
        printMethodData(new ArrayList<>());
        System.out.println("---------------");
        printMethodData(new LinkedList<>());
        System.out.println("---------------");
        printMethodData(List.of());
        System.out.println("---------------");
    }

    private static void printMethodData(List<String> input){
        Class<List<String>> clazz = (Class<List<String>>) input.getClass();

        Method[] methods = clazz.getMethods();

        Arrays.stream(methods).forEach(e -> {
            String name = e.getName();
            String returnType = e.getReturnType().getSimpleName();
            List<String> inputTypes = Arrays.stream(e.getParameterTypes()).map(Class::getSimpleName).toList();
            List<String> exceptionTypes = Arrays.stream(e.getExceptionTypes()).map(Class::getSimpleName).toList();

            System.out.printf("Method %s, returns %s, params %s, exceptions %s\n", name, returnType, inputTypes, exceptionTypes);
        });
    }
}
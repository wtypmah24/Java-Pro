package lesson_20_optional.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Main {
    /*
    * Используйте потоковые функции:
    1 Создайте метод, который принимает Optional для строки и возвращает Optional для длины этой строки.
    2 Создайте метод, который принимает Optional и возвращает true, если значение присутствует и
    * является положительным числом, иначе false.
    3 Создайте метод, который принимает два списка строк и возвращает их объединение.
    * Сначала метод берёт очередное значение из первой очереди. Если оно null,
    * то берёт значение из второго списка. Если значение второго списка null, то берётся значение по умолчанию.*/

    public static void main(String[] args) {
        System.out.println(getStrLength(Optional.of("vgfvgfvf")));
        System.out.println(getStrLength(Optional.ofNullable(null)));
        System.out.println(getStrLength(null));

        System.out.println("============task 2===============");
        System.out.println(isPresentAndPositive(Optional.of(-1)));
        System.out.println(isPresentAndPositive(Optional.of(1)));
        System.out.println(isPresentAndPositive(Optional.ofNullable(null)));

        System.out.println("============task 3===============");
        System.out.println(join(List.of("vdfv", "vfdv", "w", "gr"), List.of("a", "b", "b", "g", "h", "g", "h")));

        List<String> l1 = new ArrayList<>();
        l1.add(null);
        l1.add("b");
        l1.add("c");
        l1.add(null);
        l1.add("e");
        l1.add("f");

        List<String> l2 = new ArrayList<>();
        l2.add("f");
        l2.add("t");
        l2.add("g");
        l2.add("h");
        l2.add("l");
        l2.add(null);

        System.out.println(join(l1, l2));
    }

    private static Optional<Integer> getStrLength(Optional<String> str) {
        return (str == null ? Optional.empty() : str.map(String::length));
    }

    private static boolean isPresentAndPositive(Optional<Integer> optional) {
        return optional.filter(e -> e > 0).isPresent();
    }

    private static List<String> join(List<String> list1, List<String> list2) {
        List<String> newList = new ArrayList<>();

        Iterator<String> i1 = list1.iterator();
        Iterator<String> i2 = list2.iterator();

        while (i1.hasNext() || i2.hasNext()) {
            String el1 = i1.hasNext() ? i1.next() : null;
            newList.add(Optional.ofNullable(el1)
                    .or(() -> i2.hasNext() ? Optional.ofNullable(i2.next()) : Optional.empty())
                    .orElse("Default"));
        }
        return newList;
    }
}
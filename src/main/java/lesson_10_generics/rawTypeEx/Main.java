package lesson_10_generics.rawTypeEx;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    * Создайте список строк (ArrayList) без указания параметра.
    Попробуйте взять из него элемент с индексом 0 и присвоить его переменной типа String.
    * Выведите переменную в консоль. Запустите программу.
    Сделайте элемент с индексом 0 в списке числом. Запустите программу. Объясните результат.
* */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("World!");
        String s = (String) list.get(0);
        System.out.println(list);
        System.out.println(s);
    }
}

package lesson_27_reflection.task_4;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    /*
    * Создайте экземпляр ArrayList с помощью рефлексии.
    * Добавьте в список несколько элементов. Склонируйте список с помощью рефлексии.*/

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<ArrayList> listClass = ArrayList.class;

        List list = listClass.newInstance();

        list.add(12);
        list.add("Hello");
        list.add(true);
        System.out.println(list);

        Class[] params = {Collection.class};
        List list2 = listClass.getConstructor(params).newInstance(list);

        System.out.println(list2);
        System.out.println(list == list2);
        System.out.println(list.equals(list2));

        List list3 = new ArrayList(list);
        System.out.println(list3);

    }
}

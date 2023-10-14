package lesson_6_collection_list.task_5_linked_list;

import com.github.javafaker.Faker;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample extends Faker {
    static Faker faker = new Faker();
    public static void main(String[] args) {
        /* Создайте LinkedList, положить в переменную List<String>. Наполните
        элементами.
        Добавьте 2-3 элемента в середину.
        Организуйте цикл по списку с помощью цикла foreach. */

        List<String> str = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            str.add(faker.funnyName().name());
        }
//        System.out.println(str);

        str.add(4, "Nick");
        str.add(8, "Tyson");
        str.add(6, "Fury");

        for(String s : str){
            System.out.println(s);
        }

    }
}

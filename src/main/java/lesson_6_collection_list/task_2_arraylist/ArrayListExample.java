package lesson_6_collection_list.task_2_arraylist;

import lesson_6_collection_list.task_2_arraylist.box.HeavyBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    /* 1 Создать класс HeavyBox. Класс содержит поля уникального идентификатора, массы и размеров коробки.
    2 Создать ArrayList, содержащий не менее трёх объектов класса HeavyBox.
    3 Распечатать его содержимое.
    4 Изменить вес первого ящика на 1.
    5 Удалить последний ящик.
    6 Получить массив содержащий ящики из коллекции и вывести его в консоль.
    7 Увеличить габариты каждого ящика в 2 раза, используя цикл foreach или метод forEach().
    8 Удалить все ящики*/
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(22.2, 44.3, 22, 22));
        boxes.add(new HeavyBox(22.5, 4.3, 32, 22.6));
        boxes.add(new HeavyBox(29.5, 2.3, 32.5, 22.6));

        System.out.println(boxes);

        boxes.set(0, boxes.get(0).cloneWithNewWeight(1.0));
        boxes.remove(boxes.size() - 1);

        HeavyBox[] boxArr = boxes.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(boxArr));

        boxes.forEach(b -> {
            b.setWidth(b.getWidth() * 2);
            b.setDepth(b.getDepth() * 2);
            b.setHeight(b.getHeight() * 2);
        });
        System.out.println(boxes);
        boxes.clear();
        System.out.println(boxes);
    }
}

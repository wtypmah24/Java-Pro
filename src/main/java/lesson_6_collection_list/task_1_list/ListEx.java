package lesson_6_collection_list.task_1_list;

import java.util.List;

public class ListEx {
    /*  1 Создайте 5 переменных типа int.
    2 Из созданных переменных создайте список с помощью List.of().
    3 Проверьте, содержит ли список число 5.
    4 Организуйте цикл по списку с помощью цикла for. Для получения элемента используйте метод get().
    5 Получите список, состоящий из первых трёх элементов исходного списка.
    6 Попробуйте добавить элемент в список с помощью метода add(). Почему было получено исключение? */

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;

        List<Integer> nums = List.of(num1, num2, num3, num4, num5);

        System.out.println( nums.contains(5));

//        for(Integer num : nums){
//            System.out.println(num);
//        }
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        List<Integer> sublist = nums.subList(0, 3);
        System.out.println(sublist);

        //nums.add(99); //List.of() создаёт неизменяемую коллекцию - поэтому ошибка

        //sublist.add(99); тоже.
    }
}

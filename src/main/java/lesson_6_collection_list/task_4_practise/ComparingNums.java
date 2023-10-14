package lesson_6_collection_list.task_4_practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class ComparingNums {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(RANDOM.nextInt(9));
            list2.add(RANDOM.nextInt(9));
        }

        for (Integer integer : list1) {
            for (Integer value : list2) {
                if (Objects.equals(integer, value)) {
                    System.out.println(integer);
                }
            }
        }
    }
}

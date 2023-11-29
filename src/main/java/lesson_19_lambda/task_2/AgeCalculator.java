package lesson_19_lambda.task_2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/*
*  Напишите метод, который принимает мапу «Номер квартиры –
 * Список возрастов жильцов». Метод возвращает мапу «Номер квартиры – Средний возраст жильцов».*/
public class AgeCalculator {
    public static void main(String[] args) {
        System.out.println(getFlatToAverageAge(Map.of(
                1, List.of(33, 56, 66, 22, 45, 5),
                2, List.of(32, 4, 54, 6, 75, 4, 32),
                3, List.of(43, 5, 67),
                4, List.of(54, 6, 7, 6, 7, 5)
        )));

    }
    private static Map<Integer, Integer> getFlatToAverageAge(Map<Integer, List<Integer>> flatToAges){
        Map<Integer, Integer> flatToAverageAge = new HashMap<>();
        flatToAges.forEach((k, v) -> flatToAverageAge.put(k, getAverageAge(v)));
        return flatToAverageAge;
    }
    private static int getAverageAge(List<Integer> ages){
        AtomicInteger sum = new AtomicInteger();
        ages.forEach(sum::addAndGet);
        return sum.get() / ages.size();
    }
}

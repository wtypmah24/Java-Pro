package lesson_19_lambda.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    * 1 Напишите метод, который принимает список строк и возвращает
    * список из тех, которые начинаются с цифры.
    2 Напишите метод, который принимает мапу «Номер квартиры –
    * Список возрастов жильцов». Метод возвращает мапу «Номер квартиры – Средний возраст жильцов».
    3 Создайте 3 лямбда-выражения, которые выводят строку в консоль
    * разными способами. Передайте все лямбда-выражения в метод в виде коллекции и выведите все строки в консоль.*/
    public static void main(String[] args) {
        List<String> strs = List.of("1vfgbdh", "refrtvtrb", "0fvfgby", "fvtrbt", "vrtebetb");
        System.out.println(getStringsWithDigitsAt0(strs));
    }
    private static boolean startsWithDigit(String str){
        if (str == null || str.isBlank()) return false;
        return Character.isDigit(str.charAt(0));
    }
    private static List<String> getStringsWithDigitsAt0(List<String> input){
        List<String> filtered = new ArrayList<>();
        input.forEach((String s) -> {
            if (startsWithDigit(s)){
                filtered.add(s);
            }
        });
        return filtered;
    }
}

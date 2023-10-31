package lesson_10_generics.task_1_pair;

import java.time.LocalDate;
/*
    * 1 Создайте параметризированный класс-обёртку Pair с двумя полями разных типов -  first и second.
    * */

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> ageToName = new Pair<>(25, "Ivan");
        Pair<LocalDate, Double> dateToTemperature = new Pair<>(LocalDate.now(), 12.5);

        String name = ageToName.getSecond();
        double temp = dateToTemperature.getSecond();
        System.out.println(name + " " + temp);



    }
}

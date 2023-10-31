package lesson_10_generics.task_3;

import java.time.LocalDate;

/*
* 3 Создайте параметризированный метод, который принимает три параметра разных типов –
* first, second и third и возвращает third, если first и second не равны null.*/
public class Main {
    private static <T, V, U> U getThird (T t, V v, U u){
        return t != null && v != null ? u : null;
    }

    public static void main(String[] args) {
        System.out.println(getThird(123, "Text", LocalDate.now()));
    }
}

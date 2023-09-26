package lesson_1;

public class Task_1 {
    public static void main(String[] args) {

//        Дана строка “10”. Преобразуйте её в число и уменьшите на 1.
//        Из полученного числа и исходной строки составьте сообщение для вывода в консоль:
//        10 негритят отправились обедать,
//                1 поперхнулся, их осталось 9.

        String str = "10";
        int num = Integer.parseInt(str);
        num--;
        System.out.printf("%s негритят отправились обедать,\n1 поперхнулся, их осталось %d.", str, num);
    }
}

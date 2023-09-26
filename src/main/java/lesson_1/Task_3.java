package lesson_1;

import java.util.Scanner;

public class Task_3 {
//    Пользователь вводит порядковый номер месяца. Если введён неправильный номер, повторите запрос ввода номера месяца (do-while).
//    Используя enum Month из пакета java.time, выведите в консоль имена месяцев от January до месяца,
//    введённого пользователем включительно (for).
//    Выведите в консоль все месяцы, кроме того, который указал пользователь (foreach).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numMonth;
        do {
            System.out.print("Enter a month number: ");
            numMonth = scanner.nextByte();
        } while (numMonth < 1 || numMonth > 12);

        for (java.time.Month month : )

    }



}

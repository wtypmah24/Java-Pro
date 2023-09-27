package lesson_1;

import java.time.Month;
import java.util.Scanner;

public class MonthListing {
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

        for (int i = 0; i < numMonth; i++) {
            System.out.println(Month.values()[i]);
        }
        System.out.println("---------------------------------");
        for (Month month : Month.values()) {
            if (month.ordinal() + 1 != numMonth) {
                System.out.println(month);
            }
        }

    }
}

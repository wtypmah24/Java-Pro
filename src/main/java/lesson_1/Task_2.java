package lesson_1;

import java.util.Random;
import java.util.Scanner;

public class Task_2 {

//    Напишите программу «Средняя оценка».
//    Пользователь ставит оценку от 0 до 100. Программа ставит свою оценку случайным образом, а затем выводит, среднее значение из двух оценок.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your grade from 1 to 100: ");
        int mark = scanner.nextInt();
        Random random = new Random();
        int compMark = random.nextInt(0, 101);
        System.out.println(compMark);
        int average = (mark + compMark) / 2;
        System.out.println(average);

//     Дополните программу «Средняя оценка».
//     Выведите фразу: Have I passed the exam?
//     В случае когда, средняя оценка больше 30 или пользователь ввёл оценку ниже 0, выведите false.
//     В случае когда, средняя оценка больше 50 и оценка компьютера при этом больше оценки пользователя, выведите true.

        System.out.println("Have I passed the exam?");
        System.out.println(!(average > 30 || mark < 0));
        System.out.println((average > 50 && compMark > mark));

//      Дополните программу «Средняя оценка».
//      Если пользователь набрал меньше 33 баллов,  то вывести оценку 2.
//      Если пользователь набрал от 33 до 66 баллов,  то вывести оценку 3.
//      Если пользователь набрал от 66 до 80 баллов,  то вывести оценку 4.
//      Если пользователь набрал больше 80 баллов,  то вывести оценку 5.

        System.out.print("оценка по пятибальной шкале: ");
        short fivePoint = 1;
        if (average < 33) {
            fivePoint = 2;
            System.out.println(fivePoint);
        }
        if (average >= 33 && average < 66) {
            fivePoint = 3;
            System.out.println(fivePoint);
        }
        if (average >= 66 && average < 80) {
            fivePoint = 4;
            System.out.println(fivePoint);
        }
        if (average >= 80) {
            fivePoint = 5;
            System.out.println(fivePoint);
        }

//        Дополните программу «Средняя оценка».
//        Назначьте оценке пользователя слово, описывающее оценку:
//        2 – неуд.
//        3 – удов.
//        4 - хорошо
//        5 – отлично.
//                Выведите слово в консоль.

        String markName = switch (fivePoint) {
            case 2 -> "neud";
            case 3 -> "udov";
            case 4 -> "horosho";
            case 5 -> "otl";
            default -> "unknown";
        };
        System.out.println(markName);

//Дополните программу «Средняя оценка».
//Создайте перечисление оценок по американской системе (A, B, C ,D, E, F).
//Назначьте каждой оценке пятибалльной системы одно из значений американской системы оценок.
//0 – F
//1 – E
//2 – D
//3 – C
//4 – B
//5 – A.
//Затем по полученной оценке американской системы, используя switch, выведите «pass», когда оценка равна A, B или C.
// Выведите «fail», когда оценка D. Выведите «no data», когда оценка E или F.
        AmericanMarks americanMark = switch(fivePoint){
            case 0 -> AmericanMarks.F;
            case 1 -> AmericanMarks.E;
            case 2 -> AmericanMarks.D;
            case 3 -> AmericanMarks.C;
            case 4 -> AmericanMarks.B;
            default -> AmericanMarks.A;
        };
        System.out.println(americanMark);

        String result = switch (americanMark){
            case A, B, C -> "pass";
            case D -> "fail";
            case E, F -> "no data";
        };
    }
}

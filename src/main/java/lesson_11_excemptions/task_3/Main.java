package lesson_11_excemptions.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Создайте программу, в которой пользователь вводит неограниченное количество чисел.
        Если пользователь ввёл не число, то сообщите пользователю,
        что значение будет проигнорировано (используйте механизм исключений).
        Когда пользователь введёт quit, выведите среднее арифметическое введённых чисел
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numbers: ");

        String str = "";
        int sum = 0;
        int count = 0;

        do {
            str = scanner.nextLine();
            if ("quit".equalsIgnoreCase(str)) break;
            int num;
            try{
                num = Integer.parseInt(str);
            }catch (NumberFormatException e){
                System.out.println("Entered type will be ignored");
                continue;
            }
            sum += num;
            count++;
        }while(true);
        System.out.println("average number is " + (sum/count));
    }
}

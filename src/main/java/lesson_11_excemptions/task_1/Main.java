package lesson_11_excemptions.task_1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    /*
    * Напишите программу, чтобы узнать, какое исключение будет брошено, если:
    1 Распознать строку “12c” в число.
    2 Создать массив из отрицательного количества элементов.
    3 Обратиться к элементу массива, которого нет в массиве.
    4 Использовать метод valueOf() у одного из Enum, передав в него пустую строку.
    5 Создать строковую переменную, не присваивая ей значения, и вызвать у неё метод получения длины.
    6 В отдельном методе создать Scanner и указать в нём путь к файлу вместо System.in.
    * */
    public static void main(String[] args) throws IOException {
        /*
        Integer.parseInt("12c"); //NumberFormatException

        int[]arr = new int[-5]; //NegativeArraySizeException

        int[]arr1 = new int[5]; //ArrayIndexOutOfBoundsException
        for(int i = 0; i < 8; i++){
            arr1[i] = i;
        }

        System.out.println(DayOfWeek.valueOf("Sunday".toUpperCase(Locale.ROOT)));
        System.out.println(DayOfWeek.valueOf("Januar".toUpperCase(Locale.ROOT)));//IllegalArgumentException

        String s = null;
        System.out.println(s.length());//NullPointerException
        */
        readFile("ttrrr");

    }
    private static void readFile(String path) throws IOException {
        Scanner scanner = new Scanner(Path.of(path));
    }
}

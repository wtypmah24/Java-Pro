package lesson_16_IO.task_1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    * 1 Создайте файл test.txt на компьютере. Внутри файла test.txt
    * напишите несколько слов – каждое слово на новой строке.
    * С помощью класса Scanner прочитайте содержимое файла, добавляя каждое прочитанное слово в список.
    2 Создайте метод, который принимает список слов и выходной поток
    * в который нужно выводить данные. Вызовите метод, передав в
    * его поток вывода в консоль, затем повторите вызов, передав в метод поток записи в файл.*/
    public static void main(String[] args) throws FileNotFoundException {
        String strPath = "text.txt";
        List<String> words = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(Path.of(strPath));
            while (scanner.hasNextLine()) {
                words.add(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println(words);
        writeWords(words, System.out);
        writeWords(words, new FileOutputStream("words.txt"));
    }

    private static void writeWords(List<String> words, OutputStream output) {
        try (OutputStream output2 = new BufferedOutputStream(output)) {
            for (String word : words) {
                output2.write((word + " ").getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
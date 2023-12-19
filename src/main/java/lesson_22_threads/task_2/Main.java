package lesson_22_threads.task_2;

import lesson_22_threads.task_2.database.Database;
import lesson_22_threads.task_2.reader.Reader;
import lesson_22_threads.task_2.writer.Writer;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    /*
    * Вы разрабатываете систему управления информацией в базе данных.
    * Реализуйте модель "читатели-писатели" для безопасного доступа к данным.
    * Создайте классы Database, Reader, и Writer. Читатели считывают данные из базы,
    * а писатели записывают новые данные.*/
    public static void main(String[] args) {
        Database database = new Database();

        for (int i = 0; i < 10; i++) {

            if (ThreadLocalRandom.current().nextBoolean()){
                Writer writer = new Writer(database);
                writer.start();
            }
            Reader reader = new Reader(database);
            reader.start();
        }
    }
}

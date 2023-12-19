package lesson_21_threads.task_4;

import lesson_21_threads.task_4.long_count.LongCount;

public class Main {
    /*
    * Создайте класс с единственным публичным полем long count.
    Создайте экземпляр класса. В цикле запустите потоки, которые увеличивают значение поля на 1 и выводят его в консоль.

    Добавьте volatile полю count и повторите программу.*/
    public static void main(String[] args) {
        LongCount longCount = new LongCount();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    System.out.println(++longCount.longCount);
                }
            }).start();
        }
    }
}
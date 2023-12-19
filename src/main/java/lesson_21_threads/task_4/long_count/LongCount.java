package lesson_21_threads.task_4.long_count;

public class LongCount {
    /*
    * Создайте класс с единственным публичным полем long count.
    Создайте экземпляр класса. В цикле запустите потоки, которые увеличивают значение поля на 1 и выводят его в консоль.

    Добавьте volatile полю count и повторите программу.*/
    public volatile long longCount;
}

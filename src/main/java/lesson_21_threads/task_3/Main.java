package lesson_21_threads.task_3;

import lesson_21_threads.task_3.dateTime.Today;

public class Main {
    /*
    * Создайте класс MyDate, имеющий поля год, месяц и день.
    * Создайте класс Today. Представьте, что класс Today получает
    * сегодняшнюю дату от сервера точного времени по сети, т.е. с задержкой.
    * Смоделируйте эту ситуацию в методе getTodayDate().
    Создайте экземпляр Today, который выполнит getTodayDate() в отдельном потоке.
    * Создайте и запустите два потока, которые берут текущее значение даты из Today и
    * прибавляют случайное значение к году.

    Попробуйте синхронизировать работу метода getTodayDate().*/
    public static void main(String[] args) {
        Today today = new Today();
        Thread threadMyDate = new Thread(today::getToday);
        threadMyDate.start();

        Thread thread = new Thread(()-> System.out.println(today.getMyDate().getYear() + 5));
        thread.start();

        Thread thread1 = new Thread(()-> System.out.println(today.getMyDate().getYear() + 3));
        thread1.start();
    }

}

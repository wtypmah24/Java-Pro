package lesson_21_threads.task_1;

import lesson_21_threads.task_1.chicken.Chicken;
import lesson_21_threads.task_1.egg.Egg;

public class Main {
    /*
     * 1 Напишите программу, которая определит, что появилось раньше – курица или яйцо.
     * Для этого создайте два класса – Курица и Яйцо, которые будут наследоваться от
     * Thread и выводить своё мнение в консоль после случайно заданной задержки.
     * Задержка устанавливается методом Thread.sleep(). В основной программе запустите оба потока.
     * Чьё слово будет первым, тот и победил.

     * 2 Используя лямбда-выражения, создайте потоки,
     * каждый из которых 10_000 раз выводит в консоль число – свой номер по
     * порядку запуска. Запустите в цикле 10 потоков. Выводятся ли потоки по порядку?
     * Что будет если добавить задержку запуска, равную 1 мс?*/

    public static void main(String[] args) throws InterruptedException {

        Egg egg = new Egg();
        Chicken chicken = new Chicken();

        chicken.start();
        egg.start();

        System.out.println("The end.");

        Thread.sleep(5000);

        egg.interrupt();
        chicken.interrupt();
    }
}
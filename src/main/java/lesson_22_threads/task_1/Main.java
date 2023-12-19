package lesson_22_threads.task_1;

import lesson_22_threads.task_1.basket.Basket;
import lesson_22_threads.task_1.grandchild.Grandchild;
import lesson_22_threads.task_1.grandparent.Grandparents;

public class Main {
    /*
    * Напишите программу о бабушках/дедушках и внуках.
    * Каждая бабушка и каждый дедушка периодически кладут несколько конфет
    * в специальную корзинку. Внуки иногда заглядывают в корзинку, чтобы взять конфетку.
    * Если в корзинке нет конфет, то внуки ждут, пока они появятся. В корзинку помещается не
    * больше 10 конфет. Когда корзинка полная, то бабушки и дедушки не могут добавить в неё новые конфеты.*/
    public static void main(String[] args) {
        Basket basket = new Basket();

        for (int i = 0; i < 10; i++) {
            Grandparents oma = new Grandparents(i, basket);
            Grandchild bart = new Grandchild(i, basket);
            oma.start();
            bart.start();
        }
    }
}

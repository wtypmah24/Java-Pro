package lesson_22_threads.task_1.grandchild;

import lesson_22_threads.task_1.basket.Basket;
import lesson_22_threads.task_1.candy.Candy;

public class Grandchild extends Thread {
    private final Basket basket;

    public Grandchild(int id, Basket basket) {
        super("grandson" + id);
        this.basket = basket;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Candy candy = basket.getCandy();
                System.out.printf("%s eating candy %d%n", getName(), candy.getId());
                Thread.sleep(3000);
                System.out.printf("%s has already eat candy %d%n", getName(), candy.getId());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
package lesson_22_threads.task_1.grandparent;

import lesson_22_threads.task_1.basket.Basket;
import lesson_22_threads.task_1.candy.Candy;

public class Grandparents extends Thread {
    private final Basket basket;

    public Grandparents(int id, Basket basket) {
        super("Grandies" + id);
        this.basket = basket;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                try {
                    Candy candy = new Candy();
                    basket.putCandy(candy);
                    System.out.printf("%s putted candy %d%n", getName(), candy.getId());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("%s is waiting for rent money");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
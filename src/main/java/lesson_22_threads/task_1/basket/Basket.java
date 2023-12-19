package lesson_22_threads.task_1.basket;

import lesson_22_threads.task_1.candy.Candy;

import java.util.HashSet;
import java.util.Set;

public class Basket {
    private final Set<Candy> basket;
    private static final int MAX_SIZE = 10;

    public Basket() {
        this.basket = new HashSet<>();
    }

    public synchronized Candy getCandy() throws InterruptedException {
        while (basket.isEmpty()) {
            wait();
        }
        Candy candy = basket.stream().findFirst().orElseThrow();
        basket.remove(candy);
        System.out.println("Basket: candy" + candy.getId() + " is got");
        notify();
        return candy;
    }

    public synchronized void putCandy(Candy candy) throws InterruptedException {
        while (basket.size() == MAX_SIZE) {
            wait();
        }
        basket.add(candy);
        System.out.println("Basket: candy" + candy.getId() + " is putted");
        notify();
    }
}

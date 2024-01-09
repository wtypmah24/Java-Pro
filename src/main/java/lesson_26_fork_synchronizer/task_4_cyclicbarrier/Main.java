package lesson_26_fork_synchronizer.task_4_cyclicbarrier;

import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
    /*
     * В многопользовательской игре у каждого игрового персонажа
     *  есть различные этапы подготовки (например, загрузка ресурсов, инициализация).
     * Используйте CyclicBarrier, чтобы синхронизировать старт игровых персонажей
     * после завершения всех этапов подготовки.*/
    private static final int PLAYERS_COUNT = 3;
    private static final int STAGE_COUNT = 3;
    private static final CyclicBarrier barrier = new CyclicBarrier(PLAYERS_COUNT);

    public static void main(String[] args) {
        Arrays.stream(new int[PLAYERS_COUNT]).mapToObj(e -> new Thread(() -> {
            System.out.println("Player " + Thread.currentThread().getId() + " started preparations.");
            for (int i = 0; i < STAGE_COUNT; i++) {
                System.out.println("Player " + Thread.currentThread().getId() + " making stage " + i);
                try {
                    barrier.await();
                } catch (InterruptedException | BrokenBarrierException ex) {
                    throw new RuntimeException(ex);
                }
            }
            System.out.println("Player " + Thread.currentThread().getId() + " is ready!");
        })).forEach(Thread::start);
    }
}

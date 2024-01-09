package lesson_26_fork_synchronizer.task_3_countdown;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    /*
     * Есть несколько задач, которые выполняются параллельно,
     * и основной поток должен подождать, пока все эти задачи завершат
     * выполнение. Используйте CountDownLatch для синхронизации.*/
    private static final int COUNT_TASK = 3;
    private static final CountDownLatch LATCH = new CountDownLatch(COUNT_TASK);

    public static void main(String[] args) {

        Arrays.stream(new int[COUNT_TASK]).mapToObj(e -> new Thread(() -> {

                    try {
                        Thread.sleep(ThreadLocalRandom.current().nextInt(1000));
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                    System.out.println(Thread.currentThread().getId() + " task is completed.");
                    LATCH.countDown();
                }))
                .forEach(Thread::start);

//        try {
//            LATCH.await();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("All task are completed.");
    }
}

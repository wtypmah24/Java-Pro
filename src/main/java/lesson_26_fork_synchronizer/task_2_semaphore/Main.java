package lesson_26_fork_synchronizer.task_2_semaphore;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {
    /*
    * jЕсть файловый ресурс, который может обрабатывать ограниченное
    * количество одновременных запросов. Используйте Semaphore, чтобы
    * ограничить количество потоков, которые могут одновременно обращаться к файловому ресурсу.*/
    private static final Semaphore SEMAPHORE = new Semaphore(5);
    public static void main(String[] args) {
        List<Thread> threadList = Arrays.stream(new int[25])
                .mapToObj(e -> new Thread(()->{
                    try {
                        SEMAPHORE.acquire();
                        System.out.println(Thread.currentThread().getId() + " received access to file");
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    } finally {
                        SEMAPHORE.release();
                        System.out.println(Thread.currentThread().getId() + " finish work");
                    }
                }))
                .peek(Thread::start).toList();
        threadList.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
package lesson_21_threads.task_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = null;
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    System.out.println(finalI);
                }
            }, String.valueOf(i));
            //thread.setPriority(finalI + 1);
            thread.start();
            Thread.sleep(500);
        }
    }
}
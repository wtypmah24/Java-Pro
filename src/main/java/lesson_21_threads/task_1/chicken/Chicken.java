package lesson_21_threads.task_1.chicken;

import java.util.Random;


public class Chicken extends Thread {
    public Chicken() {
        super("Chicken");
    }

    @Override
    public void run() {
        while(!this.isInterrupted()){
            try {
                Thread.sleep(new Random().nextLong(1000, 3000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName());
        }
    }
}

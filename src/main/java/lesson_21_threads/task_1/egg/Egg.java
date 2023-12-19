package lesson_21_threads.task_1.egg;

import java.util.Random;

public class Egg extends Thread {
    public Egg() {
        super("Egg");
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

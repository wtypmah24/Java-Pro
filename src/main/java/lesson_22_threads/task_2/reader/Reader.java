package lesson_22_threads.task_2.reader;

import lesson_22_threads.task_2.data.Data;
import lesson_22_threads.task_2.database.Database;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Reader extends Thread{
    private Database database;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            database.startReading();
            Data data = database.readData();

            System.out.printf("Reader %d прочитал данные %s%n", this.getId(), data);

            database.stopReading();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

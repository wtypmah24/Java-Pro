package lesson_22_threads.task_2.writer;

import lesson_22_threads.task_2.data.Data;
import lesson_22_threads.task_2.database.Database;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Writer extends Thread{
    private Database database;

    @Override
    public void run() {
        try {
            database.startWriting();
            Data data = new Data();
            database.writeData(data);
            System.out.printf("Writer %d записал данные %s%n", this.getId(), data.getLocalDateTime());
            database.stopWriting();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

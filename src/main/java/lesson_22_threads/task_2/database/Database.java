package lesson_22_threads.task_2.database;

import lesson_22_threads.task_2.data.Data;


public class Database {
    private Data data;
    private int readerCount;
    private int writerCount;

    public Database(){
        this.readerCount = 0;
        this.writerCount = 0;
    }

    public void writeData(Data data){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.data = data;
    }
    public Data readData(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    public synchronized void startReading() throws InterruptedException {
        while (writerCount > 0) {
            wait();
        }
        readerCount++;
    }

    public synchronized void stopReading(){
        readerCount--;
        notifyAll();
    }

    public synchronized void startWriting() throws InterruptedException {
        while (readerCount > 0) {
            wait();
        }
        writerCount++;
    }

    public synchronized void stopWriting(){
        writerCount--;
        notifyAll();
    }

}

package lesson_21_threads.task_3.dateTime;

import java.time.LocalDate;

public class Today {
    private MyDate myDate;

    public synchronized MyDate getToday() {
        if (myDate != null) return myDate;
        myDate = new MyDate(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return myDate;
    }

    public synchronized MyDate getMyDate() {
        return myDate;
    }
}
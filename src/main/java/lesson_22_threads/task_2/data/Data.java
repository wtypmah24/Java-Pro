package lesson_22_threads.task_2.data;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
@Getter
@ToString
public class Data {
    private final LocalDateTime localDateTime;
    public Data(){
        this.localDateTime = LocalDateTime.now();
    }

}

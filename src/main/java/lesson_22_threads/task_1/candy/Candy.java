package lesson_22_threads.task_1.candy;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public final class Candy {
    private static int count = 0;

    public Candy() {
        this.id = count++;
    }

    private final int id;

}

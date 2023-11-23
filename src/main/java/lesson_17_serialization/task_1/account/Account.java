package lesson_17_serialization.task_1.account;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
/*
* Студент 1: сделать класс учётки пользователя для сериализации. С 2-3 полями. Передать класс студентам 2 и 3.
    Студент 2: сериализовать объект полученного класса в файл. Передать файл студенту 3.
    Студент 3: из полученного файла десериализовать объект и вывести его в консоль.*/

@Data
@AllArgsConstructor
public class Account implements Serializable {
    private String login;
    private transient String password;
    private String email;
    @Serial
    private static final long serialVersionUID = 2764L;
}
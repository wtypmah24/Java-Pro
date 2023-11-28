package lesson_18_client_server.json.person;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class Person implements Serializable {
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private Integer height;
}

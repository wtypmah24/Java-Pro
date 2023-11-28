package lesson_18_client_server.json.unparse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PersonUnparsed {
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private Integer height;
}

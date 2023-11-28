package lesson_18_client_server.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lesson_18_client_server.json.person.Person;
import lesson_18_client_server.json.unparse.PersonUnparsed;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class Main {
    /*
    *
    * 1 Конвертировать данные из Json в объект:
    2 Создать объект с 3-4 полями разных типов (в т.ч. ссылочных) и записать объект в файл в виде Json.
    3 Конвертировать объект из одного класса в другой с помощью метода convertValue класса ObjectMapper.
    * Классы не должны быть связаны общей иерархией, но имеют одинаковый набор полей.*/
    public static void main(String[] args) throws IOException {
        ObjectMapper om = new ObjectMapper();
//        String windowStr = Files.readString(Path.of("Example0.json"));
//        System.out.println(windowStr);
//        Window window = om.readValue(windowStr, Window.class);
//        System.out.println(window);
        om.registerModule(new JavaTimeModule());
        Person person = new Person();
        person.setName("John");
        person.setAge(33);
        person.setDateOfBirth(LocalDate.of(1990, 3, 4));
        person.setHeight(180);

//        om.writeValue(new File("output.json"), person);

        String unparsPersonPath = Files.readString(Path.of("output.json"));
        PersonUnparsed personUnparse = om.readValue(unparsPersonPath, PersonUnparsed.class);
        System.out.println(personUnparse);
    }
}
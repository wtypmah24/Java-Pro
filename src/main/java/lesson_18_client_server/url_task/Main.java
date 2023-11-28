package lesson_18_client_server.url_task;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://lifehacker.ru/wp-content/uploads/2018/12/Kak-fotografirovat-kotikov-19-sovetov-ot-professionala_1544744286.jpg");
        InputStream input = url.openStream();
        Path path = Path.of("img.jpeg");
        Files.copy(input, path);
    }
}
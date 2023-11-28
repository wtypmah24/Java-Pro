package lesson_18_client_server.json.window;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Window {
    private String title;
    private String name;
    private int width;
    private int height;
}

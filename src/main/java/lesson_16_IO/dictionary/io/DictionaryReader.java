package lesson_16_IO.dictionary.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryReader {
    private DictionaryReader() {
    }

    public static Map<String, String> read(String pathStr) {
        Path p = Path.of(pathStr);
        List<String> lines = new ArrayList<>();
        if (p.toFile().isDirectory() || !p.toFile().exists()) {
            throw new IllegalArgumentException("Wrong path");
        }
        try {
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return parse(lines);
    }

    private static Map<String, String> parse(List<String> lines) {
        Map<String, String> result = new HashMap<>();
        for (String line : lines) {
            String key = line.substring(0, line.indexOf(" "));
            String value = line.substring(line.lastIndexOf(" ") + 1);
            result.put(key, value);
        }
        return result;
    }
}
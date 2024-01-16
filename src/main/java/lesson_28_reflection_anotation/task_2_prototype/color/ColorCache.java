package lesson_28_reflection_anotation.task_2_prototype.color;

import java.util.HashMap;
import java.util.Map;

public class ColorCache {
    private static final Map<String, Color> DEFAULT_COLORS = Map.of(
            "Red", new Color(255, 0, 0, 255),
            "Orange", new Color(255, 106, 0, 255),
            "Yellow", new Color(255, 216, 0, 255),
            "Green", new Color(0, 255, 0, 255),
            "Blue", new Color(0, 255, 255, 255),
            "DarkBlue", new Color(0, 255, 0, 255),
            "Purple", new Color(255, 0, 255, 255),
            "Black", new Color(0, 0, 0, 255),
            "White", new Color(255, 255, 255, 255)
    );
    private final Map<String, Color> cache;

    public ColorCache() {
        this.cache = new HashMap<>(DEFAULT_COLORS);
    }

    public Color plusRed(String prototypeName, int redInc, String nameColor) {
        Color prototype = cache.get(prototypeName);
        if (prototype == null) {
            throw new IllegalArgumentException();
        }
        Color newColor = prototype.clone();
        newColor.setRed(newColor.getRed() + redInc);
        cache.put(nameColor, newColor);
        return newColor;
    }
}
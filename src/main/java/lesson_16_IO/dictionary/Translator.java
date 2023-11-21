package lesson_16_IO.dictionary;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    private Map<String, String> wordToTranslate;

    public Translator(Map<String, String> wordToTranslate) {
        this.wordToTranslate = wordToTranslate;
    }

    public Translator() {
        wordToTranslate = new HashMap<>();
    }

    public String translate(String original) {
        return wordToTranslate.get(original);
    }

    public boolean hasTranslation(String original) {
        return wordToTranslate.containsKey(original);
    }

    public void addWord(String original, String translation){
        wordToTranslate.put(original, translation);
    }
}

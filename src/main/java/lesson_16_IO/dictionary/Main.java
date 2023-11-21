package lesson_16_IO.dictionary;

import lesson_16_IO.dictionary.io.DictionaryReader;

public class Main {
    public static void main(String[] args) {
        Translator t = new Translator(DictionaryReader.read("Dicrionary1.vocab"));
        System.out.println(t.translate("painter"));
    }
}

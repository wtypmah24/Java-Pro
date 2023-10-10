package lesson_4_inheritance_static.abstractInstance;

import lesson_4_inheritance_static.abstractInstance.music.Guitar;
import lesson_4_inheritance_static.abstractInstance.music.MusicalInstr;
import lesson_4_inheritance_static.abstractInstance.music.Piano;

public class Main {
    public static void main(String[] args) {
        Piano piano = new Piano();
        Guitar guitar = new Guitar();
        playManyTimes(piano);
        playManyTimes(guitar);
    }

    private static void playManyTimes(MusicalInstr instrument){
        while (instrument.isTuned()){
            instrument.play();
        }
        instrument.play();
        instrument.tune();
        instrument.play();
    }
}
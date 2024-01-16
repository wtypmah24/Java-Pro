package lesson_28_reflection_anotation.task_2_prototype;

import lesson_28_reflection_anotation.task_2_prototype.color.Color;

public class Main {
    /*
    * Создайте класс Color с полями red, green, blue и alpha (прозрачность),
    * поля должны иметь геттеры и сеттеры, а также значения в диапазоне от 0 до 255.
    * Создайте возможность клонирования цвета. Создайте класс ColorCache, в котором
    * при создании будут храниться все цвета радуги и их названия. В ColorCache
    * можно добавлять новые цвета, передавая новый цвет и его название явно или
    * вызывая методы plusRed(), minusRed(), plusGreen(), minusGreen(), plusBlue(),
    * minusBlue(), plusAlpha(), minusAlpha(). Эти метод принимают название оригинального
    * цвета, который нужно изменить для получения нового, а также название результирующего цвета.
    Добавьте в ColorCache несколько цветов и выведите содержимое кэша на экран.*/
    public static void main(String[] args) {
        Color color = new Color();
        color.setRed(130);
        color.setGreen(140);
        color.setBlue(150);
        color.setAlpha(160);

        Color color1 = color.clone();
        System.out.println(color1.toString());
    }
}
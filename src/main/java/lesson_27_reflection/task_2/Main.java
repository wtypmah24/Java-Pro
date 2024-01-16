package lesson_27_reflection.task_2;

import lesson_27_reflection.task_2.lighting.device.SmartLamp;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    /*Создайте иерархию классов световых приборов с тремя поколениями. Например,
    световой прибор (яркость свечения, цвет)
    электрическая лампа (потребляемая мощность, тип цоколя)
    умная лампа (перечень доступных функций, тип подключения к сети передачи данных)

    Составьте мапу, в которой классу иерархии будут соответствовать его приватные поля. Выведите мапу в консоль.
    Всем строковым полям присвойте значение «abc».*/

    public static void main(String[] args) {
        Map<Class<?>, List<String>> classToFields = new HashMap<>();

        Class<?> clazz = SmartLamp.class;
        SmartLamp smartLamp = new SmartLamp();

        while (clazz != null) {
            Field[] fields = clazz.getDeclaredFields();
            classToFields.put(clazz, Arrays.stream(fields).map(Field::getName).toList());
            clazz = clazz.getSuperclass();
        }

        classToFields.forEach((k, v) -> System.out.println("Class: "
                + k.getSimpleName()
                + " \tcontains following fields: "
                + v));

        classToFields.forEach((k, v) -> {
            v.forEach(f ->{
                try {
                    Field field = k.getDeclaredField(f);
                    if (field.getType().equals(String.class)){
                        field.setAccessible(true);
                        System.out.println(f + " old value: " + field.get(smartLamp));
                        field.set(smartLamp, "abc");
                        System.out.println(f + " new value: " + field.get(smartLamp));
                        field.setAccessible(false);
                    }
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            });
        });
    }
}

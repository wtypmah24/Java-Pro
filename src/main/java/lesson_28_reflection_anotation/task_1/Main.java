package lesson_28_reflection_anotation.task_1;

import lesson_28_reflection_anotation.task_1.reflect.Lifeforms;
import lesson_28_reflection_anotation.task_1.reflect.ReflectionHelper;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {
    /*Создайте классы Human, Robot, Animal в пакете subject.
    Создайте собственную аннотацию @Lifeforms и примените
    ее к классам Human и Animal. Затем напишите класс ReflectionHelper,
    использующий Reflection API, который по названию пакета получит
    все классы, отмеченные аннотацией @Lifeforms. В методе main
    выведите названия всех найденных классов. Для каждого класса
    создайте по одному объекту, используя рефлексию и конструктор по умолчанию.
    Добавьте класс BioRobot, который расширяет класс Robot. Укажите
    аннотацию @Lifeforms над классом BioRobot. Проверьте, что новый класс находится*/
    public static void main(String[] args) {
        List<Class<?>> result = ReflectionHelper.findAnnotatedClasses("lesson_28_reflection_anotation.task_1.subject", Lifeforms.class);
        System.out.println(createObjects(result));

    }

    private static List<?> createObjects(List<Class<?>> listClasses){
        List<?> result = listClasses.stream()
                .map(c -> {
                    try {
                        return c.getDeclaredConstructor().newInstance();
                    } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                             NoSuchMethodException e) {
                        throw new RuntimeException(e);
                    }
                }).toList();
        return result;
    }
}
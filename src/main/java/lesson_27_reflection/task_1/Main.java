package lesson_27_reflection.task_1;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    /* Исследуйте класс String. Выведите в консоль
    имя полное, простое и каноническое имя класса
    в каком пакете находится
    какие модификаторы имеет
    наследником какого класса является
    какие интерфейсы наследует*/
    public static void main(String[] args) {
        Class<String> clazz = String.class;

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getCanonicalName());
        System.out.println(clazz.getPackage());

        System.out.println(clazz.getModifiers());
        System.out.println("is abstract: " + Modifier.isAbstract(clazz.getModifiers()));
        System.out.println("is final: " + Modifier.isFinal(clazz.getModifiers()));
        System.out.println("is public: " + Modifier.isPublic(clazz.getModifiers()));
        System.out.println("is static: " + Modifier.isStatic(clazz.getModifiers()));

        System.out.println(clazz);

        Class<?> parentClazz = clazz.getSuperclass();
        System.out.println(parentClazz.getName());

        Class[] interfacesClazz = clazz.getInterfaces();

        System.out.println(Arrays.stream(interfacesClazz).map(Class::getName).toList());

    }
}

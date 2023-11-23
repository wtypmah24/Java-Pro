package lesson_17_serialization.task_2;

import java.util.Map;
import java.util.Properties;

public class Main {
    /*
    * 1 Создайте программу, которая принимает набор чисел и выводит их
    * в отсортированном виде. В зависимости от аргументов запуска программы
    * данные принимаются от пользователя или читаются из файла, путь, к которому передан в аргументах.
    2 Выведите в консоль все переменные и параметры окружения.
    3 Создайте переменную окружения, в которой поместите ссылку на техподдержку
    *  (просто на любой сайт). В программе выведите в консоль наименование
    * операционной системы, сообщение, что данная ОС не поддерживается и ссылку на «техподдержку».
    *
    * Дополните программу из предыдущего задания.
    * В зависимости от того, какая настройка указана в файле настроек,
    * отсортированный список чисел должен быть выведен в консоль или сохранён
    * в выходной файл. Имя файла должно быть задано в файле настроек.*/
    public static void main(String[] args) {
        Map<String, String> vars = System.getenv();
        vars.forEach((k, v) -> System.out.println(k + "\t" + v));
        System.out.println((vars.containsKey("ABC")));
        System.out.println("--------------------");

        Properties props = System.getProperties();
        props.forEach((k, v) -> System.out.println(k + "\t" + v));

        String os = (String) props.get("os.name");
        System.out.println("--------------------");
        System.out.printf("OS %s not supported. Please visit our website %s%n", os, vars.get("SUPPORT_JAVA"));
    }
}

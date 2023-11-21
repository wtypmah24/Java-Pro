package lesson_15_patterns.task_1;

import lesson_15_patterns.task_1.form.Form;

public class Main {
    /* 1 Создайте класс Форма регистрации с 10 полями. Пользователь заполняет в форме только те поля, которые хочет.
    2 Реализуйте паттерн Строитель с помощью внутреннего класса, позволяющий создавать объект формы.
    https://refactoring.guru/ru/design-patterns/builder*/
    public static void main(String[] args) {
        Form registration = Form.builder()
                .firstName("John")
                .lastName("Wick")
                .login("Killer")
                .phone(3242L)
                .isVIP(true)
                .build();
        System.out.println(registration);
        Form.Builder builder = Form.builder().firstName("John");
        System.out.println("-------");
        builder.phone(34242L);
        System.out.println(builder.build());
    }
}

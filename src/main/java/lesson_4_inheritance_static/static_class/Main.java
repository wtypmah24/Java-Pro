package lesson_4_inheritance_static.static_class;

import lesson_4_inheritance_static.static_class.animal.Animal;

public class Main {

    public static void main(String[] args) {
        //создать класс животные с 3мя полями
        //создать статик поля для животных и статик методы
        //создать статический блок инициализации
        //вывести в консоль сообщение при любой инициализации поля
        Animal.getCow();
        Animal rino = new Animal("Rino", false, "Grey");
        System.out.println();
        Animal parrot = new Animal("Parrot", false, "Colorfully");
    }
}

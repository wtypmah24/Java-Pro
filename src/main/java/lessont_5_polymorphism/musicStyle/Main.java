package lessont_5_polymorphism.musicStyle;

import lessont_5_polymorphism.musicStyle.music.Style;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
//    Напишите программу, которая по стилю музыки, указанному пользователем, выводит описание этого стиля.
//1 В новом проекте создайте пакет music.
//            2 В пакете music создайте перечисление Style. В перечислении укажите столько названий стилей музыки,
//    сколько сможете вспомнить.
//3 В методе main реализуйте ввод пользователя.
//            4 С помощью switch получите описание стиля и выведите его в консоль.

   /* Допишите программу по выбору стиля музыки:
    Перенесите информацию о стиле в поле description.
    Добавьте поле rusName, в котором будет храниться название стиля на русском языке.
    Создайте метод, который по названию стиля на русском языке будет возвращать элемент перечисления Style.
    В методе main по названию стиля на русском языке, введённом пользователем, получите элемент перечисления.*/
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a music style: " + Arrays.toString(Style.values()));
        String str = scn.nextLine().toUpperCase(Locale.ROOT);
        Style userStyle = Style.valueOf(str);

        String description = switch (userStyle) {
            case POP -> "Popular music";
            case ROCK -> "Rock music for cool guys";
            case JAZZ -> "Jazz music is difficult music";
            case DANCE -> "Dance music for dancing";
            case FOLK -> "Folk music for festivals";
        };
        System.out.println(description);

        System.out.println(userStyle.getDescription() + userStyle.getRusName());
    }
}

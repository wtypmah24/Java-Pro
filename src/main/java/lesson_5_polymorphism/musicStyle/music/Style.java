package lesson_5_polymorphism.musicStyle.music;
/* Допишите программу по выбору стиля музыки:
    Перенесите информацию о стиле в поле description.
    Добавьте поле rusName, в котором будет храниться название стиля на русском языке.
    Создайте метод, который по названию стиля на русском языке будет возвращать элемент перечисления Style.
    В методе main по названию стиля на русском языке, введённом пользователем, получите элемент перечисления.*/

public enum Style {
    POP("Поп", "Популярная музыка"),
    ROCK("Рок", "Музыка для куртых ребят"),
    JAZZ("Джаз", "Сложная музыка"),
    DANCE("Танцевальная музыка", "Музыка для молодых"),
    FOLK("Фольк", "Музыка народов");

    private final String rusName;
    private final String description;

    Style(String rusName, String description) {
        this.rusName = rusName;
        this.description = description;
    }

    public String getRusName() {
        return rusName;
    }

    public String getDescription() {
        return description;
    }
}

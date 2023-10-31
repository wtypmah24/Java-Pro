package lesson_10_generics.task_1_pair;

public class Pair<F, S> {
    /*
    * 1 Создайте параметризированный класс-обёртку Pair с двумя полями разных типов -  first и second.
    2 Создайте параметризированный метод, который принимает два параметра одного типа –
    * значение и значение по умолчанию. Метод возвращает значение, если оно не равно null.
    * В противном случае – возвращает значение по умолчанию.
    */
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
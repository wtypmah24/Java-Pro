package lesson_4_inheritance_static.abstractInstance.music;

public class Piano extends MusicalInstr{
    //    Создайте абстрактный класс «Музыкальный инструмент». Определите в нём поле «тип инструмента» и абстрактные методы «играть»
//    и «настроить». Создайте реализацию (наследников) абстрактного класса для инструментов фортепиано, синтезатор, гитара,
//    бас-гитара, виолончель, труба, флейта. При необходимости создайте промежуточные абстрактные классы в иерархии.
    private static final int MAX_PLAY_COUNT = 10;
    private int counter = 0;
    @Override
    public void play() {
        if (isTuned()){
            System.out.println("I push the buttons!");
            counter++;
        }
        else {
            System.out.println("I can't play, piano is not tuned");
        }
    }
    @Override
    public void tune() {
        System.out.println("I tune the piano!");
        counter = 0;
    }
    @Override
    public boolean isTuned() {
        return counter < MAX_PLAY_COUNT;
    }
}

package lesson_4_inheritance_static.abstractInstance.music;

public abstract class MusicalInstr {
//    Создайте абстрактный класс «Музыкальный инструмент». Определите в нём поле «тип инструмента» и абстрактные методы «играть»
//    и «настроить». Создайте реализацию (наследников) абстрактного класса для инструментов фортепиано, синтезатор, гитара,
//    бас-гитара, виолончель, труба, флейта. При необходимости создайте промежуточные абстрактные классы в иерархии.
    String instrType;

    public abstract void  play();
    public abstract void tune();
    public abstract boolean isTuned();

}

package lesson_6_collection_list.task_2_arraylist.box;

public class HeavyBox {
    /* 1 Создать класс HeavyBox. Класс содержит поля уникального идентификатора, массы и размеров коробки.
    2 Создать ArrayList, содержащий не менее трёх объектов класса HeavyBox.
    3 Распечатать его содержимое.
    4 Изменить вес первого ящика на 1.
    5 Удалить последний ящик.
    6 Получить массив содержащий ящики из коллекции и вывести его в консоль.
    7 Увеличить габариты каждого ящика в 2 раза, используя цикл foreach или метод forEach().
    8 Удалить все ящики*/

    private static long count = 0;
    private long id;
    private double weight;
    private double width;
    private double height;
    private double depth;



    public HeavyBox(double weight, double width, double height, double length) {
        this.id = count++;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.depth = length;
    }
    public HeavyBox(HeavyBox heavyBoxOriginal) {
        this.id = heavyBoxOriginal.id;
        this.weight = heavyBoxOriginal.weight;
        this.width = heavyBoxOriginal.width;
        this.depth = heavyBoxOriginal.depth;
        this.height = heavyBoxOriginal.height;
    }

    public long getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public static long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "id=" + id +
                ", weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
    public HeavyBox cloneWithNewWeight(double newWeight){
        HeavyBox cloned = new HeavyBox(this);
        cloned.weight = newWeight;
        return cloned;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}

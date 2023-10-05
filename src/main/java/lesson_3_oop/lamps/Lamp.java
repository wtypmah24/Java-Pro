package lesson_3_oop.lamps;

import java.awt.*;

public class Lamp {
    //        Создайте класс, описывающий электрическую лампочку. Проинициализируйте поля при создании.
    //        Создайте блок инициализации и выведите значение полей. Затем измените значение полей.
    //        После этого напишите конструктор, который будет выводить текущее значение полей, затем изменять их.
    //        В программе создайте объект типа лампочка и выведите в консоль значение его полей.
    private Color color;
    private String maker;
    private int power;
    private boolean isEco;
    private LampSize lampSize;
//initialization
    {
        color = Color.BLUE;
        maker = "Euro Lamp";
        power = 40;
        isEco = true;
        lampSize = LampSize.E14;
    }

    public Lamp(){
        System.out.println(color);
        System.out.println(maker);
        System.out.println(power);
        System.out.println(isEco);
        System.out.println(lampSize);
    }

    public Lamp(int power){
        this.power = power;
        System.out.println(color);
        System.out.println(maker);
        System.out.println(this.power);
        System.out.println(isEco);
        System.out.println(lampSize);
    }
}

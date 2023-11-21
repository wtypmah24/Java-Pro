package lesson_15_patterns.task_2;

import lesson_15_patterns.task_2.point.Point;

import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
    * 1 Создайте неизменяемый класс Point, представляющий точку на плоскости с координатами x и y.
    2 Напишите класс, который создаёт точки для графика функции
    * параболы по переданным начальному значению xStart, конечному значению xEnd и шагу.
    * */
    public static void main(String[] args) {
        Point firstPoint = new Point(5, 6);
        Point secondtPoint = firstPoint.shift(2, 5);
        System.out.println(secondtPoint.x() + " " + String.valueOf(secondtPoint.y()));
        System.out.println(getParabolaPoints(0, 10, 1));
    }
    public static Set<Point> getParabolaPoints(int xStart, int xEnd, int step) {
        Set<Point> points = new HashSet<>();

        for (int x = xStart; x <= xEnd; x += step) {
            int y = x * x;
            Point point = new Point(x, y);
            points.add(point);
        }
        return points;
    }
}
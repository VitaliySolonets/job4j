package ru.job4j.condition;


import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Point {
    /**
     * Расстояние между точками в системе координат.
     *
     * @return Расстояние.
     */
    /*public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt((first + second));
    }*/

    /**
     * Это поле объекта.Оно доступно только конкретному объекту.
     */
    private int x;

    /**
     * И это поле объекта.Оно доступно только конкретному объекту.
     */
    private int y;

    /**
     * Конструктор, который принимает начальное состояние объекта "точка".
     *
     * @param first  координата x.
     * @param second координата y.
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /*public double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }*/

    /**
     * Метод расчета использующий объекты.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Добавим метод который выводит значение полей x и y.
     */
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

}

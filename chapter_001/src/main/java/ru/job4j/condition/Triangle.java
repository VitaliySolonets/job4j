package ru.job4j.condition;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru).
 * @version $1.0$
 * @since 08.06.2019.
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     * <p>
     * Формула.
     * <p>
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полупериметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param a Длина от точки a до b.
     * @param b Длина от точки a до c.
     * @param c Длина от точки b до c.
     * @return boolean
     */
    private boolean exist(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     * Формула.
     * √ p *(p-a) * (p-b) * (p-c)
     *
     * @return Вернуть площадь если треугольник существует или -1.
     */
    public double area() {
        double rls = -1;
        double a = first.distance(second);
        double b = second.distance(third);
        double c = first.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        }
        return rls;
    }
}

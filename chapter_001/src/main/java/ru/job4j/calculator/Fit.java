package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 *
 * @author Vitaly Solonets (solonets.80@mail.ru)
 * @version 1.0
 * @since 06.06.2019
 */
public class Fit {
    /**
     * Идеальный вес для мужчины.
     *
     * @param height Рост.
     * @return Идеальный вес.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Идеальный вес для женщины.
     *
     * @param height Рост.
     * @return Идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}

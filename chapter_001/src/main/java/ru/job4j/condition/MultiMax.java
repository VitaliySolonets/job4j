package ru.job4j.condition;

/**
 * Вычисление максимума из трех чисел.
 *
 * @author Vitaly Solonets (solonets.80@mail.ru).
 * @version $1.0$
 * @since 09.06.2019.
 */
public class MultiMax {
    public int max(int first, int second, int third) {
        int result1 = (first >= second) ? first : second;
        return (result1 >= third) ? result1 : third;
    }
}

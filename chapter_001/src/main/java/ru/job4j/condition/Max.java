package ru.job4j.condition;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru).
 * @version $1.0$
 * @since 08.06.2019.
 */
public class Max {
    /**
     * Вычисляет максимум.
     */
    public int max(int left, int right) {
        return (left >= right) ? left : right;
    }
}

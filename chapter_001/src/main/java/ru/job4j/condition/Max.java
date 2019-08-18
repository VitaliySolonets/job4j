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
    public int max(int first, int second) {
        return (first >= second) ? first : second;
    }

    public int max(int first, int second, int third) {
        return max(
                first,
                max(second, third)
        );
    }

    public int max(int first, int second, int third, int fourth) {
        return max(
                max(first, second),
                max(third, fourth));
    }
}

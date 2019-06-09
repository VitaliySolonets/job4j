package ru.job4j.loop;

/**
 * Факториал числа.
 *
 * @author Vitaly Solonets (solonets.80@mail.ru).
 * @version $1.0$
 * @since 09.06.2019.
 */

public class Factorial {
    public int calc(int n) {
        int result = 1;
        if (n == 0) {
            return result;
        } else {
            for (int index = 1; index <= n; index++) {
                result *= index;
            }
            return result;
        }
    }
}


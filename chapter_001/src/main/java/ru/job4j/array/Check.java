package ru.job4j.array;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru)
 * @version $1.0$
 * @since 28.06.2019
 */
public class Check {
    public boolean mono(boolean[] data) {
        for (int index = 0; index != data.length - 1; index++) {
            if (data[index] != data[index + 1]) {
                return false;
            }
        }
        return true;
    }
}

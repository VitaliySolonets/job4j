package ru.job4j.array;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru)
 * @version $1.0$
 * @since 29.06.2019
 */
public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0][0] != data[i][i] || data[i][data.length - 1 - i] != data[0][data.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

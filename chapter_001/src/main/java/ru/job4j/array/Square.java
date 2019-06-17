package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru)
 * @version $1.0$
 * @since 17.06.2019
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index != bound; index++) {
            rst[index] = (int) Math.pow(index + 1, 2);
        }
        return rst;
    }
}

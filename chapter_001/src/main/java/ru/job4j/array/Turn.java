package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru)
 * @version $1.0$
 * @since 20.06.2019
 */
public class Turn {
    public int[] back(int[] array) {
        for (int index = 0; index != array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}

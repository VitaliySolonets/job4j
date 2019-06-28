package ru.job4j.array;


/**
 * @author Vitaly Solonets (solonets.80@mail.ru)
 * @version $1.0$
 * @since 28.06.2019
 */
public class Matrix {
    public int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int out = 0; out < size; out++) {
            for (int inner = 0; inner < size; inner++) {
                array[out][inner] = (out + 1) * (inner + 1);
            }
        }
        return array;
    }
}

package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru).
 * @version $1.0$
 * @since 29.06.2019.
 */
public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique - 1; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }

   /* public static void main(String[] args) {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = duplicate.remove(input);
        System.out.println(Arrays.toString(result));
    }*/
}

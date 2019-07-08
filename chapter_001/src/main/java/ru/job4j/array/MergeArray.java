package ru.job4j.array;
/**
 * @author Vitaly Solonets (solonets.80@mail.ru)
 * @version $1.0$
 * @since 08.08.2019
 */

/**
 * Объединение двух массивов.
 */

public class MergeArray {

    public int[] merge(int[] left, int[] right) {
        int[] merge = new int[left.length + right.length];
        for (int i = 0; i < merge.length / 2; i++) {
            if (left[i] < right[i]) {
                merge[i + i] = left[i];
                merge[i + i + 1] = right[i];
            } else {
                merge[i + i] = right[i];
                merge[i + i + 1] = left[i];
            }
        }
        return merge;
    }
}

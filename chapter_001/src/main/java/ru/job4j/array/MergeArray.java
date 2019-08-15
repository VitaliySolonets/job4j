package ru.job4j.array;


/**
 * @author Vitaly Solonets (solonets.80@mail.ru)
 * @version $1.0$
 * @since 08.08.2019
 */


public class MergeArray {
    /**
     * Слияние массивов.
     *
     * @param left  первый входной массив.
     * @param right второй входной массив.
     * @return merge массив полученный из left и right.
     */
    public int[] merge(int[] left, int[] right) {
        //задаем размерность результирующего массива.
        int[] merge = new int[left.length + right.length];
        //индексы массивов для left и right соответственно.
        int i = 0;
        int j = 0;
        for (int k = 0; k < merge.length; k++) {
            if (i > left.length - 1) { //проверяем выход за пределы left.
                merge[k] = right[j];
                j++;
            } else if (j > right.length - 1) { //проверяем выход за пределы right.
                merge[k] = left[i];
                i++;
            } else if (left[i] < right[j]) { // перемещение в массив наименьшего элементаю
                merge[k] = left[i];
                i++;
            } else {
                merge[k] = right[j];
                j++;
            }
        }
        return merge;
    }


    /*public static void main(String[] args) {
        MergeArray array = new MergeArray();
        int[] result = array.merge(new int[]{2, 3, 4, 6, 7, 8}, new int[]{1, 5, 9,21,21,44,52,62,68,79,79});
        int[] ex = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print(Arrays.toString(result));
    }*/
}

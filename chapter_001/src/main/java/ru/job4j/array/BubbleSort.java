package ru.job4j.array;


/**
 * Сортировка пузырьком
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        for (int index = array.length; index > 0; index--) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int value = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = value;
                }
            }
        }
        return array;
    }

   /* public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = bubbleSort.sort(input);
        System.out.print(Arrays.toString(result));
    }*/
}

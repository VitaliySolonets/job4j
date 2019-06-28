package ru.job4j.array;


/**
 * Сортировка пузырьком
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        for (int index = 0; index < array.length; index++) {
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
}

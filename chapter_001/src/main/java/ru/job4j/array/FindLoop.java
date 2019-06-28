package ru.job4j.array;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru
 * @version $1.0$
 * @since 20.06.2019
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index <= data.length - 1; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}

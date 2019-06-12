package ru.job4j.loop;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru).
 * @version $1.0$
 * @since 09.06.2019.
 */
public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum += index;
            }
        }
        return sum;
    }
}

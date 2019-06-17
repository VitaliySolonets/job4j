package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru).
 * @version $1.0$
 * @since 17.06.2019.
 */
public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = {1, 4, 9};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound5Then1491625() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(5);
        int[] expect = {1, 4, 9, 16, 25};
        assertThat(rst, is(expect));
    }

    public void whenBound4Then14916() {
        int bound = 4;
        Square square = new Square();
        int[] rst = square.calculate(4);
        int[] expect = {1, 4, 9, 16};
        assertThat(rst, is(expect));
    }
}

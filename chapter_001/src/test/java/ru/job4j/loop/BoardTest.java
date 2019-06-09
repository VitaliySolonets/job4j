package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru).
 * @version $1.0$
 * @since 09.06.2019.
 */
public class BoardTest {
    @Test
    public void when3x3() {
        Board board = new Board();
        String rls = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rls, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
                )
        );
    }
}

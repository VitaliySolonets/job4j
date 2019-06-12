package ru.job4j.loop;

/**
 * Рисование шахматной доски.
 *
 * @author Vitaly Solonets (solonets.80@mail.ru).
 * @version $1.0$
 * @since 09.06.2019.
 */


public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}


package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru)
 * @version $1.0$
 * @since 12.06.2019
 */
public class Paint {
    /* //Правосторонний треугольник.
     public String rightTrl(int height) {
         //Буфер для результата.
         StringBuilder screen = new StringBuilder();
         //ширина будет равна высоте.
         int width = height;
         //внешний цикл двигается по строкам.
         for (int row = 0; row != height; row++) {
             //внутренний цикл определяет положение ячейки в строке.
             for (int column = 0; column != width; column++) {
                 //если строка равна ячейке, то рисуем галку.
                 //в данном случае строка определяет, сколько галок будет в строке.
                 if (row >= column) {
                     screen.append("^");
                 } else {
                     screen.append(" ");
                 }
             }
             screen.append(System.lineSeparator());
         }
         return screen.toString();
     }

     //Левосторонний треугольник.
     public String leftTrl(int height) {
         StringBuilder screen = new StringBuilder();
         int width = height;
         for (int row = 0; row != height; row++) {
             for (int column = 0; column != width; column++) {
                 if (row >= width - column - 1) {
                     screen.append("^");
                 } else {
                     screen.append(" ");
                 }
             }
             screen.append(System.lineSeparator());
         }
         return screen.toString();
     }

     public String pyramid(int height) {
         StringBuilder screen = new StringBuilder();
         int width = 2 * height - 1;
         for (int row = 0; row != height; row++) {
             for (int column = 0; column != width; column++) {
                 if (row >= height - column - 1 && row + height - 1 >= column) {
                     screen.append("^");
                 } else {
                     screen.append(" ");
                 }
             }
             screen.append(System.lineSeparator());
         }
         return screen.toString();
     }*/


    //После рефакторинга.
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}


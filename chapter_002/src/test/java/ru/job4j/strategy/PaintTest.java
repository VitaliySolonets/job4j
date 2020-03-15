package ru.job4j.strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        //получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        //Создаем буфер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в память для тестирования.
        System.setOut(new PrintStream(out));
        //Выполняем действия пишущие в консоль.
        new Paint().draw(new Square());
        //проверяем результат вычисления.
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+ + + + +")
                                .add("+       +")
                                .add("+       +")
                                .add("+       +")
                                .add("+ + + + +")
                                .toString()
                )
        );
        //возвращаем обратно ствндартный вывод в консоль.
        System.setOut(stdout);
    }
}

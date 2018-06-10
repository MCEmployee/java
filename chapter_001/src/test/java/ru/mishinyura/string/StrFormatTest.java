package ru.mishinyura.string;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Класс StrFormatTest тестирует класс StrFormat.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 10.06.2018
 */
public class StrFormatTest {
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Метод выполняется до запуска тестов.
     */
    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    /**
     * Метод выполняется после выполнения тестов.
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    /**
     * Тест метода printFormat().
     */
    @Test
    public void whenPrintFormat() {
        StrFormat.printFormat(5);

        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("Число: 5")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}
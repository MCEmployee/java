package ru.mishinyura.helloworld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Класс HelloTest тестирует класс Hello.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @version $Id$
 * @since 04.06.2018
 */
public class HelloTest {
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
     * Тест метода, который выводит в консоль приветсвтие.
     */
    @Test
    public void whenHelloThenShowGreeting() {
        Hello hello = new Hello();
        hello.greet();

        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("Hello, World !")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}
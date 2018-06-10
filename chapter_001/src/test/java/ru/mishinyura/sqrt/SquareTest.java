package ru.mishinyura.sqrt;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Класс SquareTest тестирует класс Square.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 09.06.2018
 */
public class SquareTest {
    /**
     * Тест метода sqrt().
     */
    @Test
    public void whenNumberThenSquare() {
        Square square = new Square();

        assertThat(square.sqr(2), is(4));
    }
}
package ru.mishinyura.arclength;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Класс ArcLengthTest тестирует класс ArcLength.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 10.06.2018
 */
public class ArcLengthTest {
    /**
     * Тест метода circleLength().
     */
    @Test
    public void whenCircleLength() {
        double expected = 31.4159;
        double actual = ArcLength.circleLength(5);

        assertEquals(expected, actual, 0.1);
    }
}
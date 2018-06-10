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
        ArcLength arcLength = new ArcLength();

        double expected = 31.4159;
        double actual = arcLength.circleLength(5);

        assertEquals(expected, actual, 0.1);
    }
}
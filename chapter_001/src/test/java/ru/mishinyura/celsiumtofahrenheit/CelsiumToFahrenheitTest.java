package ru.mishinyura.celsiumtofahrenheit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

/**
 * Класс CelsiumToFahrenheitTest тестирует класс CelsiumToFahrenheit.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 10.06.2018
 */
public class CelsiumToFahrenheitTest {
    /**
     * Тест метода convertCelsiumToFahrenheit.
     */
    @Test
    public void whenConvertCelsiumToFahrenheit() {
        CelsiumToFahrenheit convert = new CelsiumToFahrenheit();

        double expected = 105.8;
        double actual = convert.convertCelsiumToFahrenheit(41);

        assertEquals(expected, actual, 0.1);
    }
}
package ru.mishinyura.random;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Класс RandomNumberTest тестирует класс RandomNumber.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 11.06.2018
 */
public class RandomNumberTest {
    @Test
    public void whenGetNumber() {
        RandomNumber randomNumber = new RandomNumber();
        boolean result = randomNumber.getNumber() >= 0 && randomNumber.getNumber() <= 100;

        assertThat(result, is(true));
    }
}
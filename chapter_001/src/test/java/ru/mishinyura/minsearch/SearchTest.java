package ru.mishinyura.minsearch;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Класс SearchTest тестирует класс Search.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 12.06.2018
 */
public class SearchTest {
    /**
     * Тест метода min().
     */
    @Test
    public void min() {
        Search search = new Search();

        assertThat(search.min(12, 33), is(12));
        assertThat(search.min(1, 2, 3), is(1));
        assertThat(search.min(-20, -10, -30, -40), is(-40));
    }
}
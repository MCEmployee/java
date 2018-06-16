package ru.mishinyura.ifelsecase;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CompareIntTest {
    /**
     * Тест метода compare().
     */
    @Test
    public void whenCompareThenResult() {
        assertThat(new CompareInt().compare(3, 5), is(-1));
        assertThat(new CompareInt().compare(5, 5), is(0));
        assertThat(new CompareInt().compare(7, 5), is(1));
    }
}
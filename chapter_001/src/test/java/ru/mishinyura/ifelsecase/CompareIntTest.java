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
        assertThat(CompareInt.compare(3, 5), is(-1));
        assertThat(CompareInt.compare(5, 5), is(0));
        assertThat(CompareInt.compare(7, 5), is(1));
    }
}
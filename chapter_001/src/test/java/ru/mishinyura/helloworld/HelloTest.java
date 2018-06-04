package ru.mishinyura.helloworld;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloTest {
    @Test
    public void whenAdd() {

        assertThat(true, is(true));
    }

}
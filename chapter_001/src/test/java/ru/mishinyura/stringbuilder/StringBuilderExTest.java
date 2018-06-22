package ru.mishinyura.stringbuilder;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Class StringBuilderExTest test StringBuilderEx.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 22.06.2018
 */
public class StringBuilderExTest {
    /**
     * Tests method show().
     */
    @Test
    public void whenShowThenDisplayResult() {
        StringBuilderEx stringBuilderEx = new StringBuilderEx();
        String name = "Yura";
        int age = 18;

        assertThat(stringBuilderEx.show(name, 18),
                is(new StringBuilder()
                        .append("My name is ")
                        .append(name)
                        .append(".")
                        .append(System.lineSeparator())
                        .append("I am ")
                        .append(age)
                        .append(" young.")
                        .toString()));
    }
}
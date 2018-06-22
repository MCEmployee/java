package ru.mishinyura.stringbuilder;

/**
 * Class StringBuilderEx shows the example of StringBuilder use.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 22.06.2018
 */
public class StringBuilderEx {
    /**
     * Method make the String out of pieces.
     *
     * @param name Name.
     * @param age  Age.
     * @return String.
     */
    public final String show(final String name, final int age) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("My name is ");
        stringBuilder.append(name);
        stringBuilder.append(".");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("I am ");
        stringBuilder.append(age);
        stringBuilder.append(" young.");

        return stringBuilder.toString();
    }
}

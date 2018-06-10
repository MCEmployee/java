package ru.mishinyura.string;

/**
 * Класс StrFormat реализует вывод строки вида String.format.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 10.06.2018
 */
public final class StrFormat {
    /**
     * Конструктор.
     */
    private StrFormat() {
    }

    /**
     * Метод выводит на экран форматированную строку.
     *
     * @param number Число для вывода.
     */
    public static void printFormat(final int number) {
        System.out.println(String.format("Число: %d", number));
    }
}

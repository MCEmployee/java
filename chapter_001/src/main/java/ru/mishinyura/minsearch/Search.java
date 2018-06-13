package ru.mishinyura.minsearch;

/**
 * Класс Search реализует поиск минимального значения.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 12.06.2018
 */
public class Search {
    /**
     * Метод вычисляет минимум среди двух чисел.
     *
     * @param a Число.
     * @param b Число.
     * @return Результат.
     */
    public final int min(final int a, final int b) {
        int result;
        if (a < b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }

    /**
     * Метод вычисляет минимум среди трёх чисел.
     *
     * @param a Число.
     * @param b Число.
     * @param c Число.
     * @return Результат.
     */
    public final int min(final int a, final int b, final int c) {
        return min(min(a, b), c);
    }

    /**
     * Метод вычисляет минимум среди четырёх чисел.
     *
     * @param a Число.
     * @param b Число.
     * @param c Число.
     * @param d Число.
     * @return Результат.
     */
    public final int min(final int a, final int b, final int c, final int d) {
        return min(min(a, b), min(c, d));
    }
}

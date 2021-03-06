package ru.mishinyura.ifelsecase;

/**
 * Класс CompareInt реализует сравнение двух целых чисел.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 16.06.2018
 */
public final class CompareInt {
    /**
     * Метод сравнивает два целых числа.
     *
     * @param a Первое число.
     * @param b Второе число.
     * @return Результат.
     */
    public int compare(final int a, final int b) {
        return Integer.compare(a, b);
    }
}

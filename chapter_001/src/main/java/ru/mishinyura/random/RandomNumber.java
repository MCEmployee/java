package ru.mishinyura.random;

/**
 * Класс RandomNumber реализует вычисление случайного числа
 * на интервале [0; 100].
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 11.06.2018
 */
public class RandomNumber {
    /**
     * Коэффициент расчёта случайного числа.
     */
    private static final int KOEF = 100;
    /**
     * Метод реализует вычисление случайного числа.
     * @return Число.
     */
    public final int getNumber() {
        return (int) (Math.random() * KOEF);
    }
}

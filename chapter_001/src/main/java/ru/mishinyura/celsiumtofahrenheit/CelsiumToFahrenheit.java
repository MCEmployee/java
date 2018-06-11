package ru.mishinyura.celsiumtofahrenheit;

/**
 * Класс CelsiumToFahrenheit.
 * Переводит градусы Цельсия в градусы Фаренгейта.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 10.06.2018
 */
public class CelsiumToFahrenheit {
    /**
     * Литералы для расчёта.
     */
    private static final int FIRST = 9, SECOND = 5, THIRD = 32;

    /**
     * Метод переводит градусы Цельсия в градусы Фаренгейта.
     *
     * @param celsium Градусы Цельсия.
     * @return Градусы Фаренгейта.
     */
    public final double convertCelsiumToFahrenheit(final int celsium) {
        return (double) (celsium * FIRST) / SECOND + THIRD;
    }
}

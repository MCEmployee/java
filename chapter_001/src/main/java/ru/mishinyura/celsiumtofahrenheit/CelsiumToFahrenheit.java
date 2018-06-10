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
     * Метод переводит градусы Цельсия в градусы Фаренгейта.
     *
     * @param celsium Градусы Цельсия.
     * @return Градусы Фаренгейта.
     */
    public final double convertCelsiumToFahrenheit(final int celsium) {
        return (double) (celsium * 9) / 5 + 32;
    }
}

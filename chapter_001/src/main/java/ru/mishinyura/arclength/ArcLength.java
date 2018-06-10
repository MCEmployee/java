package ru.mishinyura.arclength;

/**
 * Класс ArcLength. Считает длину окружности.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 10.06.2018
 */
public class ArcLength {
    /**
     * Метод вычисляет длину окружности.
     *
     * @param radius Радиус.
     * @return Длина.
     */
    public final double circleLength(final int radius) {
        return 2 * Math.PI * radius;
    }
}

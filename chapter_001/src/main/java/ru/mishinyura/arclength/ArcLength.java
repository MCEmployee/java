package ru.mishinyura.arclength;

/**
 * Класс ArcLength. Считает длину окружности.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 10.06.2018
 */
public final class ArcLength {
    /**
     * Конструктор.
     */
    private ArcLength() {
    }

    /**
     * Метод вычисляет длину окружности.
     *
     * @param radius Радиус.
     * @return Длина.
     */
    public static double circleLength(final int radius) {
        return 2 * Math.PI * radius;
    }
}

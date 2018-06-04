package ru.mishinyura.helloworld;

/**
 * Класс Hello реализует вывод приветствия.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @version $Id$
 * @since 04.06.2018
 */
public final class Hello {
    /**
     * Конструктор.
     */
    private Hello() {
    }

    /**
     * Метод выводит в консоль приветствие.
     */
    public static void greet() {
        System.out.println("Hello, World !");
    }
}

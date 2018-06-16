package ru.mishinyura.input;

import java.util.Scanner;

/**
 * Класс ScannerEx реализует консольный ввод-вывод.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 16.06.2018
 */
public final class ScannerEx {
    /**
     * Конструктор.
     */
    private ScannerEx() {
        throw new UnsupportedOperationException();
    }

    /**
     * Точка входа в приложение.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Как тебя зовут? ");
        String name = scanner.nextLine();
        System.out.print("Сколько тебе лет? ");
        int age = scanner.nextInt();
        System.out.println(String.format(
                "Привет, %s! Тебе %d лет.", name, age));
        scanner.close();
    }
}

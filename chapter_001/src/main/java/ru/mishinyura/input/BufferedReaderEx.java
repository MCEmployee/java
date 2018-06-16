package ru.mishinyura.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Класс BufferedReaderEx реализует консольный ввод-вывод.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 16.06.2018
 */
public final class BufferedReaderEx {
    /**
     * Конструктор.
     */
    private BufferedReaderEx() {
        throw new UnsupportedOperationException();
    }

    /**
     * Точка входа в приложение.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(final String[] args) {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        try {
            System.out.print("Как тебя зовут? ");
            String name = reader.readLine();
            System.out.print("Сколько тебе лет? ");
            String sAge = reader.readLine();
            System.out.println(String.format(
                    "Привет, %s! Тебе %s лет.", name, sAge));
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

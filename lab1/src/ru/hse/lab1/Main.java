package ru.hse.lab1;

import ru.hse.lab1.second.Person;

/**
 * @author Бирюков Тимофей Александрович
 * @version 1.0
 * @since 2026
 */

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person("Иван", 20);

        ivan.printInfo();
    }
}
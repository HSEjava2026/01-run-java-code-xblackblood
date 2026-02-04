package ru.hse.lab1;

import ru.hse.lab1.second.Person;

public class Main {
    public static void main(String[] args) {
        Person tima = new Person("Тима", 20);

        System.out.println("Имя: " + tima.getName());
        System.out.println("Возраст: " + tima.getAge());
    }
}
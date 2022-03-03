package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            switch (matches) {
                case 0 -> System.out.println("Введите число от 1 до 3");
                case 1, 2, 3 -> {
                    if (count < matches) {
                        System.out.println("На столе нету столько спичек!!!");
                        continue;
                    }
                    turn = !turn;
                    count -= matches;
                    System.out.println("Количетсво спичек на столе: " + count);
                }
                default -> System.out.println("Введите от 1 до 3 небольше!");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }

}
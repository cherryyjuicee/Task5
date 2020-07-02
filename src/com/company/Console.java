package com.company;

import java.util.Scanner;

public class Console {
    public static void play() throws Exception {

    Scanner sc = new Scanner(System.in);

    System.out.println("");
    System.out.println("Пожалуйста, введите дерево");
    System.out.println("Например: 9 (2 (6 (10), 6), 5 (, 6 (2, 10)))");
    System.out.print("Строка ввода: ");

    String notationTree = sc.nextLine();
    System.out.println ("Вы ввели дерево: " + notationTree);

    System.out.println("");
    Tree.findMaxElement(notationTree);
    System.out.println("");

    System.exit(0);

    }
}

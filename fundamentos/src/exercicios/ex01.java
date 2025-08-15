package exercicios;

import java.util.Scanner;

public class ex01 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite seu nome: ");
        String name = scanner.next();

        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();

        System.out.printf("Olá %s você tem %d anos", name, age);
    }

}

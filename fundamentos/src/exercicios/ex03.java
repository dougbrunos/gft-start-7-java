package exercicios;

import java.util.Scanner;

public class ex03 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double height = scanner.nextDouble();

        double area = base * height;

        System.out.println("A área é de: " + area);
    }

}

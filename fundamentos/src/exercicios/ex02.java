package exercicios;

import java.util.Scanner;

public class ex02 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o tamanho do lado do quadrado em metros: ");
        double side = scanner.nextDouble();

        double area = side * side;

        System.out.println("A área do quadrado é " + area);
    }

}

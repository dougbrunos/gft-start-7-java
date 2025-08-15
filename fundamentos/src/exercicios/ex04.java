package exercicios;

import java.util.Scanner;

public class ex04 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String names[] = new String[2];
        int ages[] = new int[2];
        int maxAge = 0;
        String maxAgeName = "";
        int minAge = 999;
        String minAgeName = "";

        for(int i = 0; i < 2; i++) {
            System.out.println("- Pessoa " + (i + 1));
            System.out.print("Digite seu nome: ");
            names[i] = scanner.next();
            System.out.print("Digite sua idade: ");
            ages[i] = scanner.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            if(ages[i] > maxAge) {
                maxAge = ages[i];
                maxAgeName = names[i];
            }
            if(ages[i] < minAge) {
                minAge = ages[i];
                minAgeName = names[i];
            }
        }

        int ageDiff = maxAge - minAge;

        System.out.println(maxAgeName + " é mais velho do que " + minAgeName);
        System.out.println("A difereça de idade é de " + ageDiff + " anos.");

    }

}

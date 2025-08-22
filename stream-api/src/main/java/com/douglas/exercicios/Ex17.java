package com.douglas.exercicios;

import java.util.Arrays;
import java.util.List;

public class Ex17 {

    public static void main(String[] args) {
        // Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(Ex17::isPrime)
                .forEach(System.out::println);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}

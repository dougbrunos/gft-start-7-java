package com.douglas.exercicios;

import java.util.Arrays;
import java.util.List;

public class Ex02 {

    public static void main(String[] args) {
        // Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer soma = numeros.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println(soma);
    }

}

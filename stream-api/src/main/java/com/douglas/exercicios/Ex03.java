package com.douglas.exercicios;

import java.util.Arrays;
import java.util.List;

public class Ex03 {

    public static void main(String[] args) {
        // Com a ajuda da Stream API, verifique se todos os números da lista são
        // positivos e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, -3, 3, 4, 5, -1);

        numeros.stream()
                .filter(n -> n > 0)
                .forEach(System.out::println);
    }

}

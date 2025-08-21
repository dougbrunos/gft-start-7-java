package com.douglas.exercicios;

import java.util.Arrays;
import java.util.List;

public class Ex13 {

    public static void main(String[] args) {
        // Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().filter(n -> n > 5 && n < 10).forEach(System.out::println);
    }

}

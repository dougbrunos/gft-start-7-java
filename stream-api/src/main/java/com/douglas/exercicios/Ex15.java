package com.douglas.exercicios;

import java.util.Arrays;
import java.util.List;

public class Ex15 {

    public static void main(String[] args) {
        // Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, -7, 8, 9, 10, -5, 4, 3);  

        numeros.stream().filter(n -> n < 0).forEach(System.out::println);
    }

}

package com.douglas.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex09 {

    public static void main(String[] args) {
        // Com a Stream API, verifique se todos os números da lista são distintos (não
        // se repetem) e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Set<Integer> unicos = numeros.stream().collect(Collectors.toSet());

        if (unicos.size() < numeros.size()) {
            System.out.println("Existem valores repetidos no stream.");
        } else {
            System.out.println("Não existem valores repetidos no stream.");
        }
    }

}

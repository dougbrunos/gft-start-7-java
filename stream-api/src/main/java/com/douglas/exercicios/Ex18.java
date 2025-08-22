package com.douglas.exercicios;

import java.util.Arrays;
import java.util.List;

public class Ex18 {

    public static void main(String[] args) {
        // Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream().distinct().count() == 1;

        System.out.println(todosIguais);

    }

}

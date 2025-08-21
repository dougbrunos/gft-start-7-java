package com.douglas.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ex05 {

    public static void main(String[] args) {
        // Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average();

        if(media.isPresent()) {
            System.out.println("Média: " + media.getAsDouble());
        } else {
            System.out.println("Nenhum número maior que 5 foi encontrado");
        }

    }

}

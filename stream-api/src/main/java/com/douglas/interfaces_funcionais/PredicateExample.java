package com.douglas.interfaces_funcionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "C", "Go");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }

}

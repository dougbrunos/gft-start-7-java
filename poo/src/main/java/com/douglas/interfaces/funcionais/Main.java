package com.douglas.interfaces.funcionais;

import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<User> users = List.of(new User("Douglas", 22), new User("Maria", 20), new User("Joao", 30));
        users.forEach(System.out::println);
        printStringValue(User::name, users);

    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }

}
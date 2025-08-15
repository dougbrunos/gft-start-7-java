package com.douglas.classes;

public class Main {
    public static void main(String[] args) {
        Person male = new Person();
        male.setName("Douglas");
        male.setAge(22);

        Person female = new Person();
        female.setName("Maria");
        female.setAge(20);

        Person person = new Person("Joaquin", 30);

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());
        System.out.println("Person name: " + person.getName() + " age: " + person.getAge());
    }
}
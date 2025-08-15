package com.douglas.heranca_polimorfismo;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setName("Douglas");
        manager.setLogin("douglas");
        manager.setPassword("123");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());

        System.out.println(manager instanceof Employee);
    }

}
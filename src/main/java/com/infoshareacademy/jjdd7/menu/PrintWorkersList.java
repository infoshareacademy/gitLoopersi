package com.infoshareacademy.jjdd7.menu;

public class PrintWorkersList implements Menu {

    @Override
    public void doAction() {
        System.out.println("\n1. Dodaj pracownika");
        System.out.println("2. Usuń pracownika");
        System.out.println("0. Powrót");
    }
}

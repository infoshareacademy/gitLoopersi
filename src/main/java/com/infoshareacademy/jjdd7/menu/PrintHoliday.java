package com.infoshareacademy.jjdd7.menu;

public class PrintHoliday implements Menu {

    @Override
    public void doAction() {
        System.out.println("\n1. Wprowadź nazwę święta");
        System.out.println("2. Podaj zakres dat (pokazuje format)");
        System.out.println("0. Powrót");
    }
}

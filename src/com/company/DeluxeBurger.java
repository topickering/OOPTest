package com.company;

public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe", "Brioche", "mixed bean", 4.89);
        super.addBurgerAddition1("Chips", 1.04);
        super.addBurgerAddition2("Soft drink", 1.25);
    }

    @Override
    public void addBurgerAddition1(String name, double price) {
        System.out.println("Cannot add addition items to a Deluxe Burger, sorry!");
    }

    @Override
    public void addBurgerAddition2(String name, double price) {
        System.out.println("Cannot add addition items to a Deluxe Burger, sorry!");
    }

    @Override
    public void addBurgerAddition3(String name, double price) {
        System.out.println("Cannot add addition items to a Deluxe Burger, sorry!");
    }

    @Override
    public void addBurgerAddition4(String name, double price) {
        System.out.println("Cannot add addition items to a Deluxe Burger, sorry!");
    }
}

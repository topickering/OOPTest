package com.company;

public class Main {

    public static void main(String[] args) {

        Burger testBurger = new Burger("Basic", "Brioche", "Bean", 3.95);
        testBurger.addBurgerAddition1("Lettuce", 0.30);
        testBurger.addBurgerAddition2("Swiss cheese", 0.35);
        double testBurgerPrice = testBurger.itemizeBurger();
        System.out.println("Total price is: " + testBurgerPrice + "\n");

        HealthyBurger testHealthyBurger = new HealthyBurger("Avo", 3.59);
        testHealthyBurger.addBurgerAddition1("Lettuce", 0.30);
        testHealthyBurger.addHealthyAddition1("Vegan cheese", 0.29);
        double testHealthyBurgerPrice = testHealthyBurger.itemizeBurger();
        System.out.println("Total price is: " + testHealthyBurgerPrice + "\n");
    }
}

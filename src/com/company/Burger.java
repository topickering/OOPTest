package com.company;

public class Burger {
    private String name;
    private String rollType;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Burger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public void addBurgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addBurgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addBurgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addBurgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeBurger() {
        double burgerPrice = this.price;
        System.out.println(this.name + " burger on a " + this.rollType + " roll, price: " + this.price);

        if(this.addition1Name != null) {
            burgerPrice += this.addition1Price;
            System.out.println("Additional item: " + this.addition1Name + " added, price: " + this.addition1Price);
        }

        if(this.addition2Name != null) {
            burgerPrice += this.addition2Price;
            System.out.println("Additional item: " + this.addition2Name + " added, price: " + this.addition2Price);
        }

        if(this.addition3Name != null) {
            burgerPrice += this.addition3Price;
            System.out.println("Additional item: " + this.addition3Name + " added, price: " + this.addition3Price);
        }

        if(this.addition4Name != null) {
            burgerPrice += this.addition4Price;
            System.out.println("Additional item: " + this.addition4Name + " added, price: " + this.addition4Price);
        }

        return burgerPrice;
    }
}

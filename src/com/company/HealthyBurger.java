package com.company;

public class HealthyBurger extends Burger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "brown rye", meat, price);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeBurger() {
        double burgerPrice = super.itemizeBurger();

        if(this.healthyExtra1Name != null) {
            burgerPrice += this.healthyExtra1Price;
            System.out.println("Additional item: " + this.healthyExtra1Name + " added, price: " + this.healthyExtra1Price);
        }

        if(this.healthyExtra2Name != null) {
            burgerPrice += this.healthyExtra2Price;
            System.out.println("Additional item: " + this.healthyExtra2Name + " added, price: " + this.healthyExtra2Price);
        }

        return burgerPrice;
    }
}

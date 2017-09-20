package com.Jerry;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Steak", 12.43, "White");
        super.addHamburgerAdditional1("Chips",0.82);
        super.addHamburgerAdditional2("Drink", 2.00);
    }

    @Override
    public double totalPrice() {
        double price = super.totalPrice();
        return price;
    }

    @Override
    public void addHamburgerAdditional3(String name, double price) {
        System.out.println("Cannot add additional toppings");
    }

    @Override
    public void addHamburgerAdditional4(String name, double price) {
        System.out.println("Cannot add additional toppings");
    }
}

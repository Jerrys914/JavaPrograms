package com.Jerry;

public class DeluxeBurger extends Hamburger {
    private double chipsPrice = 0.82;
    private double drinkPrice = 2.00;

    public DeluxeBurger(String meat, double price, String rollType) {
        super("Deluxe", meat, price, rollType);
    }

    @Override
    public double totalPrice() {
        double price = super.totalPrice();
        price += this.chipsPrice;
        price += this.drinkPrice;
        System.out.println("Deluxe burger comes with chips and a drink for an extra $" + (this.chipsPrice + this.drinkPrice));
        return price;
    }

    @Override
    public void addHamburgerAdditional1(String name, double price) {
        System.out.println("Cannot add additional toppings");
    }

    @Override
    public void addHamburgerAdditional2(String name, double price) {
        System.out.println("Cannot add additional toppings");
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

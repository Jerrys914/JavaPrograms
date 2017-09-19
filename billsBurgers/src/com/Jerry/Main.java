package com.Jerry;

public class Main {

    public static void main(String[] args) {
	    Hamburger burger = new Hamburger("Basic", "Beef", 5.25, "Wheat");
	    burger.addHamburgerAdditional1("Cheese", 0.37);
		System.out.println("Basic burger is $" + burger.totalPrice());

		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 6.50);
		healthyBurger.addHamburgerAdditional1("Egg", 2.35);
		healthyBurger.add1ExtraHealthy("Avacado", 3.26);
		System.out.println("Healthy burger is $" + healthyBurger.totalPrice());

		DeluxeBurger deluxeBurger = new DeluxeBurger("Steak", 8.37, "Triple Bun");
		System.out.println("Deluxe burger is $" + deluxeBurger.totalPrice());
	}
}

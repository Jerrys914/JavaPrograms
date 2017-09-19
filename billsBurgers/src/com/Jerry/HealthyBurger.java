package com.Jerry;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye Roll");

    }

    public void add1ExtraHealthy(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void add2ExtraHealthy(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double totalPrice() {
        double price = super.totalPrice();

        if(healthyExtra1Name != null){
            price += healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for $" + this.healthyExtra1Price);
        }

        if(healthyExtra2Name != null) {
            price += healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for $" + this.healthyExtra2Price);
        }
        return price;
    }
}

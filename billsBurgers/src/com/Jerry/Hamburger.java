package com.Jerry;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String rollType;

    private String additional1Name;
    private double additional1Price;

    private String additional2Name;
    private double additional2Price;

    private String additional3Name;
    private double additional3Price;

    private String additional4Name;
    private double additional4Price;

    public Hamburger(String name, String meat, double price, String rollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.rollType = rollType;
    }

    public void addHamburgerAdditional1(String name, double price) {
        this.additional1Name = name;
        this.additional1Price = price;
    }

    public void addHamburgerAdditional2(String name, double price) {
        this.additional2Name = name;
        this.additional2Price = price;
    }

    public void addHamburgerAdditional3(String name, double price) {
        this.additional3Name = name;
        this.additional3Price = price;
    }

    public void addHamburgerAdditional4(String name, double price) {
        this.additional4Name = name;
        this.additional4Price = price;
    }

    public double totalPrice() {
        double sum = this.price;

        if(this.additional1Name != null){
            sum += additional1Price;
            System.out.println("Added " + this.additional1Name +" for $" + this.additional1Price);
        }
        if(this.additional2Name != null){
            sum += additional2Price;
            System.out.println("Added " + this.additional2Name +" for $" + this.additional2Price);
        }
        if(this.additional3Name != null){
            sum += additional3Price;
            System.out.println("Added " + this.additional3Name +" for $" + this.additional3Price);
        }
        if(this.additional4Name != null){
            sum += additional4Price;
            System.out.println("Added " + this.additional4Name +" for $" + this.additional4Price);
        }
        return sum;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5;
	    float myFloatValue = 5f/2f;
	    double myDoubleValue = 5d;
        System.out.println("My Int Val = " + myIntValue);
        System.out.println("My Float Val = " + myFloatValue);
        System.out.println("My Double Val = " + myDoubleValue);

        //pounds to kilos
        double pounds = 200d;
        double kilos = pounds * 0.45359237d;
        System.out.println(kilos);
    }
}

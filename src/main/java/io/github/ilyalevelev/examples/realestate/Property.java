package io.github.ilyalevelev.examples.realestate;

public class Property {

    int price;
    String city;
    String area;
    boolean sold;


    public Property(String city, String area, int price, boolean sold) {
        this.price = price;
        this.city = city;
        this.area = area;
        this.sold = sold;
    }

    // This method is called when you print a property, or when you turn it into a string
    // It is usually used to test, debug, for the developer, not to show to the user
    @Override
    public String toString() {
        return this.area + " - " + this.city;
    }
}

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
}

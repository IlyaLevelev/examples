package io.github.ilyalevelev.examples.realestate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Property p1 = new Property("Barcelona", "Eixample", 200000, false);
        Property p2 = new Property("Barcelona", "Eixample", 150000, true);
        Property p3 = new Property("Barcelona", "Clot", 150000, false);

        List<Property> properties = new ArrayList<>();
        properties.add(p1);
        properties.add(p2);
        properties.add(p3);

        List<Property> properties2 = Arrays.asList(p1, p2, p3);


        // fori iter
        for (Property property : properties) {
            if (!property.sold) {
                System.out.println(property.area + " - " + property.price + " eur");
            }
        }


        int total = Main.numAvailableProperties(properties2);
        System.out.println("total = " + total);

    }

    /**
     * Given a list of properties this function returns the total number of not sold properties.
     */
    public static int numAvailableProperties(List<Property> properties) {

        int result = 0;

        for (Property property : properties) {
            if (!property.sold) {
                result ++;
            }
        }

        return result;
    }

    /**
     * Given a list of properties this function returns a list of the not sold properties.
     */

    public static List<Property> listAvailableProperties(List<Property> properties){

        List<Property> result = new ArrayList<>();
        for (Property property : properties) {
            if (!property.sold) {
            result.add(property);
            }
        }
        return result;
    }
}

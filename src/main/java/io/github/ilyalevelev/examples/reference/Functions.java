package io.github.ilyalevelev.examples.reference;

/**
 * Program with comments explaining how functions work
 */
public class Functions {

    /**
     * This function called `main` is the entry point of a program.
     * When you run a program, the statements here are executed.
     *
     * When the whole `main` function is executed, the program ends.
     */
    public static void main(String[] args) {

        System.out.println("First statement of this program");

        // You may call a function by using its name and
        // the necessary values (arguments) inside parenthesis.
        // The value that the function returns can be assigned
        // to a variable (in this case, we assign it to `finalPrice`).
        double finalPrice = calculateFinalPrice(1000, 0.20);

        // You can call the function multiple times (with different values)
        double finalPrice2 = calculateFinalPrice(500, 0.10);

        System.out.println("finalPrice = " + finalPrice);
        System.out.println("finalPrice2 = " + finalPrice2);

        // Some functions don't return any value.
        // In that case we can't assign the result to a variable when we call the function.
        sayThis("Hello world");

        System.out.println("Last statement of this program");
    }

    /**
     * This is a function definition.
     *
     * The first line is called the "header" and it's where you specify:
     *
     *             what type of value the function returns (output)
     *              |
     *              |       the name of the function
     *              |           |
     *              |           |      the values the function
     *              |           |      needs as input (parameters)
     *              |           |                         |
     *              |           |                         |
     *              V           V                         V          */
    public static double calculateFinalPrice(double price, double discount) {

        // Inside here, you write the implementation of the function.
        // That is, what the function should do.

        // It's usual to first declare a variable `result` with
        // the return type of the function.
        double result;

        // Then we calculate the result
        result = price * (1 - discount);

        // And finally we return the result value
        return result;

        // The value you return can be assigned to a variable
        // when you call the function (see the variable `finalPrice`).
    }

    /**
     * Some functions don't return anything.
     * We use `void` to indicate that the function doesn't return any value.
     *            |
     *            |
     *            V                                */
    public static void sayThis(String message) {

        System.out.println("I'm saying: " + message );

        // No `return` statement here
    }
}
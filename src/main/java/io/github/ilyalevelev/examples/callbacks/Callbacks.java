package io.github.ilyalevelev.examples.callbacks;

public class Callbacks {

    public static void main(String[] args) {

        int result = printAndLength("hello");
        System.out.println(result);

        printRepeat(3, "go");

        String repeatedWord = repeatString(5, "home");
        System.out.println(repeatedWord);

        repeat(5, () -> {
            int x = printAndLength("hi");
            System.out.println(x);
        });
    }

    /**
     * Given a string and a number n, returns a string with spaces on the right until the length is n.
     * Example: padRight("cat", 7) ---> "cat    "
     */

    /**
     * Given a boolean b and 2 functions f1 and f2, executes f1 if b is true, or f2 if b is false.
     */

    /** Given a number n and a function, calls the function n times */
    public static void repeat(int n, Runnable function) {

        for (int i = 0; i < n; i++) {
            function.run();
        }
    }

    /** A function that takes a string and prints it and returns its length */
    public static int printAndLength (String text) {

        System.out.println(text);
        return text.length();
    }


    /**
     * Given a number and a text prints the text that number of times
     */
    public static void printRepeat (int n, String text) {

        for (int i = 1; i <= n; i++) {
            System.out.println(text);
        }
    }

    /**
     * Given a number and a text returns the text repeated that number of times
     */
    public static String repeatString (int n, String text) {

        String result = "";

        for (int i = 1; i <= n; i++) {

            result += text;
        }

        return result;

    }

}

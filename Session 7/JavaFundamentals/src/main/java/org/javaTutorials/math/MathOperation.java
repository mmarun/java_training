package org.javaTutorials.math;

/**
 * Class with basic mathematical operations
 */
public class MathOperation {

    /**
     * Return addition of two integers
     * @param a
     * @param b
     * @return sum of two int
     */
    public int add(int a, int b){
        return a + b;
    }

    /**
     * Removes empty characters from start and end of the given string
     * @param input
     * @return String
     */
    public static String trim(String input){
        return input.trim();
    }

    /**
     * PRIVATE METHOD : return substraction of given integers
     * @param a
     * @param b
     * @return
     */
    private int substract(int a, int b){
        return a - b;
    }
}

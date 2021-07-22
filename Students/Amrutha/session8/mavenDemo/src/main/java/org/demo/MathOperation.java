package org.demo;

import java.util.logging.Logger;

/**
 * Class for performing calculator functionality
 */
public class MathOperation{


    static Logger log = Logger.getLogger(MathOperation.class.getName());

    /**
     * addOperation perform addition of two numbers
     * @param number1
     * @param number2
     * @return sum of two int
     */
    public int addOperation(int number1,int number2)
    {
        log.info("Added successfully");
        return number1+number2;
    }
    /**
     * subtractOperation perform subtraction of two number
     * @param number1
     * @param number2
     * @return subtract of two int
     */
    public int subtractOperation(int number1,int number2)
    {
        log.info("subtraction successful");
        return number1-number2;
    }

    /**
     * multiplyOperation perform multiply of two int
     * @param number1
     * @param number2
     * @return
     */
    public int multiplyOperation(int number1,int number2)
    {
        log.info("Multiplication successful");
        return number1*number2;
    }

    /**
     * divideOperation perform division of two int
     * @param number1
     * @param number2
     * @return
     */
    public int divideOperation(int number1,int number2)
    {
        log.info("Division is successful");
        return number1/number2;
    }
}

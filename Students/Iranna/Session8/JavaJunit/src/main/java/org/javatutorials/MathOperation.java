package org.javatutorials;
import java.util.logging.Logger;

public class MathOperation {
    static Logger log = Logger.getLogger(MathOperation.class.getName());
    /**
     * return addition of two numbers
     * @param a
     * @param b
     * @return sum of two int
     */
    public int add(int a,int b)
    {
        log.info("Addition successfull");
        return a+b;
    }

    /**
     * return subtration  of two numbers
     * @param a
     * @param b
     * @return subtractin of two int
     */
    public int subtract(int a,int b)
    {
        log.info("subtraction successfull");
        return a-b;
    }

    /**
     * return multiplication  of two numbers
     * @param a
     * @param b
     * @return multiplication of two int
     */
    public int multiply(int a,int b)
    {
        log.info("multiplication successfull");
        return a*b;
    }

    /**
     * return division  of two numbers
     * @param a
     * @param b
     * @return division of two int
     */

    public int divide(int a,int b)
    {
        log.info("division successfull");
        return a/b;
    }
}

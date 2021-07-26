package com.javaTutorials;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        MathOperation mathoperation=new MathOperation();
        int a=7;
        int b=5;
        /**
         * Autoboxing
         */
        Integer number1=Integer.valueOf(a);
        Integer number2=Integer.valueOf(b);

        logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");


        System.out.println( "Addition--" + mathoperation.add(number1,number2));
        System.out.println("Subtraction--"+ mathoperation.subtract(number1,number2));
        System.out.println("Multiply--"+ mathoperation.multiply(number1,number2));
        System.out.println("Division--"+mathoperation.divide(number1,number2));
    }
}

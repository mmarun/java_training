package org.example;

import java.util.logging.Logger;

public class MathOpretion {

    static Logger log = Logger.getLogger(MathOpretion.class.getName());

    public int add(int a,int b)
    {
        log.info("Addition completed successfully");
        return a+b;
    }

    public int sub(int c,int d)
    {
        log.info("Substraction completed successfully");
        return c-d;
    }

    public int mul(int n1,int n2)
    {
        log.info("Multiplication completed successfully");
        return n1*n2;
    }

    public int div(int n1,int n2)
    {
        log.info("Division completed successfully");
        return n1/n2;
    }

    public int remainder(int a,int b)
    {
        log.info("Remainder completed successfully");
        return a%b;
    }

}

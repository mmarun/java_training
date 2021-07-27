package org.javatutorials;
import java.util.logging.Logger;

public class MathHelper {
    static Logger log = Logger.getLogger(MathHelper.class.getName());

    /**
     * returns remainder of numbers
     * @param a
     * @param b
     * @return remainder of integers
     */
    public int remainder(int a,int b)
    {
        log.info("Remainder  successfull");
        return a%b;
    }
}

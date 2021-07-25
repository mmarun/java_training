package org.demo;

import java.util.logging.Logger;

/**
 * class for performing remainder functionality
 */
public class MathHelper {
    static Logger log = Logger.getLogger(MathHelper.class.getName());

    /**
     * remainder method to find remainder of number by modNumber
     * @param number
     * @param modNumber
     * @return remainder of integer number by modNumber
     */
    public int remainder(int number,int modNumber)
    {
        log.info("Remainder added successfully");
        return number%modNumber;
    }
}

package org.example;

import java.util.function.DoubleSupplier;

public class SupplierImp implements DoubleSupplier{

    static Double add(double x,double y)
    {
        return x+y;
    }

    static Double sub(double x,double y)
    {
        return x-y;
    }
    @Override
    public double getAsDouble() {
        return 0;
    }

}
